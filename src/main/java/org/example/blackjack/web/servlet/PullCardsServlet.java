package org.example.blackjack.web.servlet;

import com.google.gson.Gson;
import org.example.blackjack.BlackjackGame;
import org.example.blackjack.Player;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PullCardsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BlackjackGame game = (BlackjackGame) request.getSession().getAttribute("gameObject");
        Player player = game.pullCards();
        String jsonGame = new Gson().toJson(game);
        request.getSession().setAttribute("game", jsonGame);
        if (player != null) {
            String jsonPlayer = new Gson().toJson(player);
            request.getSession().setAttribute("player", jsonPlayer);
            request.getRequestDispatcher("/end.jsp").forward(request, response);
        } else {
            request.getSession().setAttribute("gameObject", game);
            request.getRequestDispatcher("/pullCards.jsp").forward(request, response);
        }
    }
}
