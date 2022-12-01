package com.api.gallery.controller;

import com.api.gallery.common.ArtType;
import com.api.gallery.model.Art;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class ArtController {

    @GetMapping("/art")
    public Art getArt(){
        UUID id = UUID.randomUUID();

        BufferedImage originalImage= null;
        try {
            originalImage = ImageIO.read(new File("C:\\Users\\User\\Downloads\\monalisa.gif"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        try {
            ImageIO.write(originalImage, "jpg", baos );
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] imageInByte=baos.toByteArray();

        return new Art(id, "Monalisa", ArtType.Oil, imageInByte);
    }

}
