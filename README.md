# study

## Spring-boot Application 구동 방법 

- 해당 application 폴더에 pom.xml이 있는지 확인 후 pom.xml이 있는 위치에서 아래의 command 입력 

```bash
mvn spring-boot:run 
```

## Kafka 실행 순서 

- 모두 kafka 폴더의 bin 폴더 아래서 실행해야 

1. zookeeper server 실행 
```bash
./zookeeper-server-start.sh ../config/zookeeper.properties
```

2. kafka server 실행 
```bash
./kafka-server-start.sh ../config/server.properties
```

3. kafka consumer 실행 (channel에서 message 확인 하기 위해 
```bash
./kafka-console-consumer.sh --bootstrap-server http://localhost:9092 --topic [TOPIC NAME]
```


