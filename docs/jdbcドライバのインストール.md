# JDBCドライバのインストール with Intellij

21章 データアクセスで、 プログラムの実行に JDBCドライバが必要になります。

この資料で、 Intellijに ドライバをインストールする手順を記します。

## 手順
リポジトリを Intellijで開いた状態で、 以下の手順を実施してください。

#### 1. メインメニューの `File` → `Project Structure...` を選択します。

![image](https://user-images.githubusercontent.com/22954486/110637244-86e1a100-81f0-11eb-927b-f4268f763df2.png)


#### 2. メニュー左の `Libraries` → 中央の「+ボタン」 から`From Maven..` を選択します。

![image](https://user-images.githubusercontent.com/22954486/110637578-e475ed80-81f0-11eb-84db-a5bb223dd52f.png)

#### 3. 検索窓に `mysql` と入力して実行 → コネクタを選択して `OK` を押下します。

※ 画像と同じものを選んで大丈夫です。

![image](https://user-images.githubusercontent.com/22954486/110638155-8c8bb680-81f1-11eb-8e09-b1ba3e67d007.png)

#### 4. Project Structureで `OK` を選択します。
![image](https://user-images.githubusercontent.com/22954486/110638492-fc01a600-81f1-11eb-8df8-9bd68b9f0c89.png)

<br>

以上です。
