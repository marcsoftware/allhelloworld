javac Hello.java
java Hello
javac -d . src/Atomic1.java
java -classpath . src.Atomic1

#react commands 
npm install -g create-react-native-app
create-react-native-app MyReactNative
npm install -g react-native-cli //optional
npm start
CTRL+C
npm run eject
react-native run-android

#react commands with expo
npm install -g expo-cli   //one time only
expo init AwesomeProject
cd AwesomeProject
npm start # you can also use: expo start

#springboot method1
mvn spring-boot:run

#springboot method2
mvn clean package
java -jar target/gs-actuator-service-0.1.0.jar









