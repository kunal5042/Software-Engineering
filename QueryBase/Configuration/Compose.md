```xml
mongodb:  
  image: mongo:latest  
  environment:  
    MONGO_INITDB_DATABASE: QueryBaseDefaultMongo  
    MONGO_INITDB_ROOT_PASSWORD: root  
    MONGO_INITDB_ROOT_USERNAME: root  
  ports:  
    - "27017:27017"
```