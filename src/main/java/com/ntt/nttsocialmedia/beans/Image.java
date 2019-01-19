package com.ntt.nttsocialmedia.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author leetHuam
 * @version 1.0
 */
@Data
@NoArgsConstructor
@Document
public class Image {
    @Id private String id;
    private String name;

    public Image(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
