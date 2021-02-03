package com.managerTopicSubject.mts.dto.team;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Map;

@Data
@NoArgsConstructor
public class TeamUpdateRequestDTO {

    @Id
    private Long id;

    @NotNull @NotBlank @Size(min = 5, max = 50)
    private String name;

    @NotNull @NotBlank
    private Map<String, Object> topicId;
}
