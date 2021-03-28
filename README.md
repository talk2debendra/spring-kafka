# Getting Started

- Download and install Kafka,Zookeeper
- Download and install kafka UI tool : https://www.kafkatool.com/download.html

- Create a topic as topic_message
- Run the application
- Post following request :
- localhost:9098/message/publish   POST  
{
	"from":"debnedra.dhinda@gmail.com",
	"to":"myluck@gmail.com",
	"message":"Never give up"
}


- Check the logs. 