SET PATH=C:\Users\fjsanchez\AppData\Local\Google\Cloud SDK\google-cloud-sdk\bin;C:\jdk-11.0.0.1\bin;%PATH%;

gcloud config set project mrh-frio
mvn package appengine:deploy -P prod


gcloud app deploy .\target\mrh-frio\WEB-INF\cron.yaml