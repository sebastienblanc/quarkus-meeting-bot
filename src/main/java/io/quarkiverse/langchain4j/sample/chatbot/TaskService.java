package io.quarkiverse.langchain4j.sample.chatbot;

import jakarta.enterprise.context.ApplicationScoped;

import dev.langchain4j.agent.tool.Tool;
import io.quarkus.logging.Log;

@ApplicationScoped
public class TaskService {

    @Tool("create a task for the assignee")
    public void createTask(String assignee, String content) {
        Log.info("Creating a task assigned to " + assignee + " with current content : " + content);
    }
}
