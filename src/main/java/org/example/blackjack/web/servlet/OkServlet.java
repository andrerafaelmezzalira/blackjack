package org.example.blackjack.web.servlet;

import com.google.gson.Gson;
import org.example.blackjack.BlackjackGame;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OkServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BlackjackGame game = new BlackjackGame();
        String jsonGame = new Gson().toJson(game);
        request.getSession().setAttribute("game", jsonGame);
        request.getSession().setAttribute("gameObject", game);
        request.getRequestDispatcher("/pullCards.jsp").forward(request, response);
    }
}
