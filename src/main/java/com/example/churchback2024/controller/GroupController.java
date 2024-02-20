package com.example.churchback2024.controller;

import com.example.churchback2024.controller.request.group.GroupAddRequest;
import com.example.churchback2024.controller.request.group.GroupCreateRequest;
import com.example.churchback2024.controller.request.group.GroupUpdateRequest;
import com.example.churchback2024.controller.response.group.GroupListResponse;
import com.example.churchback2024.controller.response.group.GroupResponse;
import com.example.churchback2024.dto.GroupDto;
import com.example.churchback2024.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("/church+/group")
public class GroupController {
    private final GroupService groupService;

    @GetMapping("/list")
    public ResponseEntity<GroupListResponse> getGroupList(){
        GroupListResponse groupListResponse = groupService.getGroupList();
        return ResponseEntity.ok(groupListResponse);
    }

    @PostMapping("/create")
    public ResponseEntity<GroupResponse> createGroup(@RequestBody GroupCreateRequest request){
        GroupDto groupDto = groupService.createGroup(GroupDto.from(request));
        GroupResponse groupResponse = new GroupResponse(groupDto);
        return ResponseEntity.ok(groupResponse);
    }

    @PostMapping("/add")
    public ResponseEntity<GroupResponse> addGroup(@RequestBody GroupAddRequest request){
        GroupDto groupDto = groupService.addGroup(GroupDto.from(request));
        GroupResponse groupResponse = new GroupResponse(groupDto);
        return ResponseEntity.ok(groupResponse);
    }
    @PatchMapping("/{groupId}")
    public ResponseEntity<GroupResponse> updateGroup(@PathVariable Long groupId, @RequestBody GroupUpdateRequest request){
        return ResponseEntity.ok(groupService.updateGroup(groupId, GroupDto.from(request)));
    }

    @DeleteMapping("/{groupId}")
    public void deleteGroup(@PathVariable Long groupId){
        groupService.deleteGroup(groupId);
    }
}
