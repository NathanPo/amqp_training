package fr.lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class ChatMessageController {

    @GetMapping
    public String getLastTenMessages() {
        return ChatMessageRepository.getLastTenMessages().toString();
    }
}
