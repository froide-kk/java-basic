# dockerを用いたMySQL環境の構築

21章のデータアクセスで MySQL環境をローカルに構築する必要があります。

この資料で構築に必要な手順を記します。

### 事前準備

- dockerのインストール
- mysql クライアントのインストール

## コマンド

プロジェクトに docker用のソースを用意しています。

サンプルデータベースは 公式のサンプルを使用しています [MySQL :: Other MySQL Documentation](https://dev.mysql.com/doc/index-other.html)

### コンテナの作成&起動
```
$ docker-compose up --buid -d
```

### コンテナの停止
```
$ docker-compose up --buid -d
```

### コンテナの起動
```
$ docker-compose start
```

### データベースへのアクセス
```
 mysql -u root -P 3306
```


## その他
phpMyAdmin も用意しているので `http://localhost:8080/` にアクセスすることで、 ブラウザ上で閲覧が可能です。
