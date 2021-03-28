# Getting Started

# How to Setup Kafka on Windows
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

# Install Kafka
- Download Kafka from http://kafka.apache.org/downloads.html
- Extract it using 7ZIP .
- Go to your Kafka config directory.For me it is C:\kafka\config
- Edit the file “server.properties.”
- Find and edit the line log.dirs=/tmp/kafka-logs” to “log.dir= C:\kafka\kafka-logs.
- If your ZooKeeper is running on some other machine or cluster ,edit “zookeeper.connect:2181” to your custom IP and port. For this demo, we are using the same machine.
- Your Kafka will run on default port 9092 and connect to ZooKeeper’s default port, 2181.

# Start Kafka Server
- Go to your Kafka installation directory. For me it is C:\kafka
- Open command promot here
- Now type .\bin\windows\kafka-server-start.bat .\config\server.properties and press Enter.
If everything will be ok, your server will start.

# Kafka UI tool
There is a nice tool Offset Explorer (formerly Kafka Tool)  avail to create topic, monitor it.
- Download and install kafka UI tool : https://www.kafkatool.com/download.html

- Create a topic as topic_message

# Start your application
- Run the application
- Post following request :
- localhost:9098/message/publish   POST  
{
	"from":"debnedra.dhinda@gmail.com",
	"to":"myluck@gmail.com",
	"message":"Never give up"
}


- Check the logs. 
