## Code Generator
npm install @openapitools/openapi-generator-cli -g

openapi-generator generate -i COBISAuthorizationAPI.yaml -c config.json -o D:\code\auth -g spring --additional-properties=library=spring-boot,beanValidations=true,swaggerAnnotations=true,serviceImplementation=true --import-mappings OffsetDateTime=java.lang.String --type-mappings OffsetDateTime=java.lang.String

## Commands to AWS
mvn clean package && aws cloudformation delete-stack --stack-name auth-api && aws cloudformation package --template-file sam.yaml --output-template-file output-sam.yaml --s3-bucket cobis-openapi-poc && aws cloudformation deploy --template-file D:\code\auth\output-sam.yaml --stack-name auth-api --capabilities CAPABILITY_IAM

## Commands to Jar
mvn clean install -Pdev

## Docker
docker build -t auth .
docker run -p 8080:8080 auth 