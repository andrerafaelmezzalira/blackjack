<!DOCTYPE html>
<html>
	<head>
        <link rel="stylesheet" href="index.css">
		<title>Jogo Finalizado!</title>
	</head>
	<body>
		<form method="post" action="end">
			<div class="content">
				<div id="player" class="blackjack"></div>
				<div id="dealer" class="blackjack"></div>
				<div id="result" class="blackjack"></div>
				<div class="blackjack">
    				<button>Reiniciar Jogo</button>
			    </div>
			</div>
		</form>
	</body>
</html>
<script>
    window.onload = function() {
        var game = JSON.parse('${sessionScope.game}');
        var player = JSON.parse('${sessionScope.player}');
        document.getElementById('player').innerHTML = game.player.name + ' tem ' + game.player.score + " pontos.";
        document.getElementById('dealer').innerHTML = game.dealer.name + ' tem ' + game.dealer.score + " pontos.";
        document.getElementById('result').innerHTML = player.name + ' ganhou!';
    }
</script>
