package com.ntt.nttsocialmedia;

import com.ntt.nttsocialmedia.beans.Image;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author leetHuam
 * @version 1.0
 */
public class ImageTest {
    @Test
    public void imagesManagedByLombokShouldWork() {
        Image image = new Image("id", "file-name.jpg");
        assertThat(image.getId()).isEqualTo("id");
        assertThat(image.getName()).isEqualTo("file-name.jpg");
    }
}
