package com.example.churchback2024.domain;

import com.example.churchback2024.dto.GroupDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroupC extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;
    private String groupName;

    public void update(GroupDto groupDto) {
        this.groupName = groupDto.getGroupName();
    }

    public static GroupC from(GroupDto groupDto) {
        return GroupC.builder()
                .groupName(groupDto.getGroupName())
                .build();
    }
}
