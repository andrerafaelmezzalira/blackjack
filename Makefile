run:
	mvn exec:java -Dexec.mainClass="org.example.blackjack.web.MainWeb"

install:
	mvn clean install

package:
	mvn clean package
