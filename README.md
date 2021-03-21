# SpringBoot

Spring で「Hello, World」RESTful Web サービス

# 参考

- [ガイド - 公式サンプルコード](https://spring.pleiades.io/guides#getting-started-guides)
  - [Spring Boot REST API の作成 - 公式サンプルコード](https://spring.pleiades.io/guides/gs/rest-service/)
  - [Spring Initializr](https://start.spring.io/)
- [Spring リファレンスドキュメント - Java フレームワーク](https://spring.pleiades.io/)
- [Spring Boot 「使い方」ガイド - リファレンスドキュメント > 3. 組み込み Web サーバー](https://spring.pleiades.io/spring-boot/docs/current/reference/html/howto.html#howto-embedded-web-servers)

```bash
# 準備
unzip demo.zip
cd demo
./gradlew clean build
# ソースの追加
## リソース表現クラス
touch src/main/java/com/example/demo/Greeting.java
## リソースコントローラー
touch src/main/java/com/example/demo/GreetingController.java
# 起動
## Gradle起動
./gradlew bootRun
## Jar起動
./gradlew build
java -Dspring.profiles.active=default -jar build/libs/demo-0.0.1-SNAPSHOT.jar

# 動作確認
## パラメータなし
curl -XGET "http://localhost:8080/greeting"
## パラメータあり
curl -XGET "http://localhost:8080/greeting?name=User"
```

![Spring Initializer](https://gyazo.com/d8fd78d8fcb429890f2d798a48cf258c/raw)
