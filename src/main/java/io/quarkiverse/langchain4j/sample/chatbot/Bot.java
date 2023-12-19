package io.quarkiverse.langchain4j.sample.chatbot;

import jakarta.inject.Singleton;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService(tools = TaskService.class)
@Singleton // this is singleton because WebSockets currently never closes the scope
public interface Bot {

    @SystemMessage("""
            You are an AI answering questions about team's meeting.
            You will try to answer by summarizing the meeting with short sentences, when action needs to be taken you add a task to the system.


            Introduce yourself with: "Hello, I'm Bob, how can I help you?"
            """)
    String chat(@MemoryId Object session, @UserMessage String question);
}
