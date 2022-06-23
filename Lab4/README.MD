

Steps to use the code

javac -encoding UTF-8 --source-path src -d dist src/*.java

javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java

java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path






Please see the tests within the PNG folder.


Please note that the last test wasn't able to be completed. For some reason it couldn't understand that 15 was 0 at mod 3. This is consistent for 30, 45 ...
