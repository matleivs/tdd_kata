# tdd_kata
a repository for our TDD Kata code


#1
Kata “String Calculator”:

Erstellt eine Funktion, die einen String entgegennimmt und das Ergebnis der darin erhaltenen Rechnung zurückgibt. Unterstützt werden sollen die vier Grundrechenarten (+,-,/,*) für Integerwerte. Die Signatur sähe so aus:
Number calculate(String expression)


#2
Kata “Card Game”:

Eine Funktion soll das Ergebnis eines Kartenspiels zwischen zwei Spielern zurückgeben. Input sind deren Karten. In jeder Runde wird von jedem Spieler eine Karte genommen und diese miteinander verglichen. Haben sie denselben Wert, erhält keiner einen Punkt. Ansonsten bekommt der Spieler mit der höheren Karte einen Punkt. Die Karten werden durch Charakter (‘2’,‘3’,…,‘K’,‘A’) repräsentiert. Zum Schluss soll das Ergebnis als String zurückgegeben werden (“Tie” oder “Player 2 wins 3 to 4"). Signatur ist:
String determineGameResult(char[] cardsOfPlayer1, char[] cardsOfPlayer2)


#3
Encryptor Kata:

Encryptor legacy code kata from Emily Bache
see https://github.com/emilybache/Encryptor-Refactoring-Kata
  
  
#4 
Search Engine - Parse query sentences - Part I:

We are going to work in a particular piece for a search engine. The engine is intended to search for professionals within a given area. Users will do queries like “list the Java developers in Berlin”, expecting to find a list of people’s profiles. The problem is quite complex and we are new to TDD. So we are going to start off using the inside-out approach, working with a small part, a small behavior, and then evolving the solution step by step.
Let’s focus on a small feature. A filter that parses the query before sending it to the search engine’s core. Given an input string containing the query sentence, we want a list of strings (words) as the output. Those output words must be transformed to avoid synonyms. The idea is that if I am, as a user, looking for a “developer”, it should find the same results as when I ask for “developers” (note the plural). And it should be the same if the words contain upper case letters. For now, we are going to consider only the English regular plurals of nouns.
So our filter must identify and transform words in the given sentence.


#5
Search Engine - Parse query sentences - Part II:

Well-crafted code is ready to be changed to include new, unexpected requirements (to some extent). Is your code from Part I clean?
Now the business guys want to release the search engine in other languages. The engine must understand German. But the German nouns are more complex to pluralize, so there are different rules. It is so difficult that we are going to handle a single rule, for the sake of simplicity. We are not going to consider what the article is before the noun (which in German affects the plural). The new rule is that when the filter is configured to work in German, the plural of a word ending in “berg” is transformed into “berge” (still not always right in German where it can also be “bergen”).
