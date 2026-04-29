## java・Spring Boot・Oracle DBでWebアプリをゼロから構築。環境構築、DB設計、Thymeleaf画面開発、ビルド～デプロイまで

> [!tip]
> 作成するのは一覧画面、新規追加画面のToDo画面なので、
> 
> 後で編集、削除、更新、画面は後で追加する。

> [!note]
> Java Spring Boot + Oracle DB のWebアプリ開発手法
> Java開発環境構築
> Oracle DB の基礎
> JavaScpringBootプロジェクトの始め方
> Java を使ってOracleDBへアクセスする方法
> Tymeleaf 、 Bootstrap を使ったフロントエンドの実装方法
>


> [!note]
> Oracle Database FreeのDcker版を使用
> イメージのダウンロード:
> docker pull container-registry.oracle.com/database/free:latest
> 
> コンテナの起動（パスワードを設定して起動）:
> docker run -d -p 1521:1521 -e ORACLE_PWD=<パスワード> -n oracle-free container-registry.oracle.com/database/free:latest
> 
> これだけでデータベースが立ち上がり、すぐに利用可能になる


