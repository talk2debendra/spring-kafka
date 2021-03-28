# Getting Started

# How to Setup Kafka
# Install ZooKeeper
- Download Zookeeper from https://zookeeper.apache.org/releases.html#download
- Extract using 7Zip
- Go to ZooKeeper config directory. e.g. C:\apache-zookeeper\conf
- Rename file “zoo_sample.cfg” to “zoo.cfg”
- Open zoo.cfg in any text editor, like Notepad
- Find and edit dataDir=/tmp/zookeeper to :\apache-zookeeper\data
- Add an entry in the System Environment Variables ZOOKEEPER_HOME = C:\apache-zookeeper
- You can change the default Zookeeper port in zoo.cfg file (Default port 2181)
- Run ZooKeeper by opening a new cmd and type zkserver


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
