SET PATH=C:\GCloudSDK\google-cloud-sdk\bin;C:\openjdk_1.8.0\bin;%PATH%;
mvn clean package -P prod
gcloud config set project mrh-frio
gcloud app deploy .\target\mrh-frio\WEB-INF\appengine-web.xml --version=r8-0-3 --no-stop-previous-version --no-promote
