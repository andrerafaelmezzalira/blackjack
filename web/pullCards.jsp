<!DOCTYPE html>
<html>
	<head>
        <link rel="stylesheet" href="index.css">
		<title>Puxar Cartas</title>
	</head>
	<body>
		<form method="post" action="pullCards">
			<div class="content">
				<div id="player" class="blackjack"></div>
				<div id="dealer" class="blackjack"></div>
                <div class="blackjack">
                    <button>Puxar Carta</button>
                </div>
			</div>
		</form>
	</body>
</html>
<script>
    window.onload = function() {
        var game = JSON.parse('${sessionScope.game}');
        document.getElementById('player').innerHTML = game.player.name + ' tem ' + game.player.score + " pontos.";
        document.getElementById('dealer').innerHTML = game.dealer.name + ' tem ' + game.dealer.score + " pontos.";
    }
</script>
