# Meeting Bot

Simple sample app that act as an AI agent for meeting reports. It will be ingesting 3 meeting transcripts (you can found them in resources/catalog).

The mebeddings are stored in pgvector. Browse to localhost:8080 , open the bot window and ask question to the bot.

There one tool defined to assign tasks, you can ask the bot to assign tasks, the TaskService will be called. 

## pre-req

You need an openAI key with gpt4 enabled, in dev mode the pgvector will be spawned, otherwise make sure to have a datasource pointing to a postresql that supports pgvector. 

