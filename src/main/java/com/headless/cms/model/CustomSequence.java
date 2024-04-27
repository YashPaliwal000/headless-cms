package com.headless.cms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customSequences")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomSequence {

    @Id
    private String id;
    private Long seq;

}

