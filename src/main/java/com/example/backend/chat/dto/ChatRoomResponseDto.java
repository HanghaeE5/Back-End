package com.example.backend.chat.dto;

import com.example.backend.chat.domain.ChatRoom;
import com.example.backend.chat.domain.Participant;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ChatRoomResponseDto {
    private String roomId;
    private String name;
    private List<ParticipantResponseDto> participantList = new ArrayList<>();

    public ChatRoomResponseDto(ChatRoom room) {
        this.roomId = room.getRoomId();
        System.out.println("============================8");
        this.name = room.getName();
        System.out.println("==========================9");
        for (Participant p : room.getParticipantList()) {
            this.participantList.add(new ParticipantResponseDto(p));
        }
        System.out.println("==============================12");
    }
}
