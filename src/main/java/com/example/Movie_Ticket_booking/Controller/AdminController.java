package com.example.Movie_Ticket_booking.Controller;

import com.example.Movie_Ticket_booking.Model.MovieModel;
import com.example.Movie_Ticket_booking.Repository.MovieRepository;
import com.example.Movie_Ticket_booking.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;



    @GetMapping("/addMovie")
    public String addMoviePage(Model model){
        model.addAttribute("title","Add Movie");
        model.addAttribute("movieModel",new MovieModel());
        return "Admin/AddMovie";
    }


    @PostMapping("/addMovieToDb")
    public String addMovieToDb(@ModelAttribute("movieModel")MovieModel movieModel, @RequestParam("movieImg")MultipartFile[] imgs) throws IOException {
        List<String> urlList = new ArrayList<>();
        Arrays.stream(imgs).forEach(multipartFile -> {
            try{
                urlList.add(multipartFile.getOriginalFilename());
                File savefile = new ClassPathResource("static/images").getFile();
                Path path = Paths.get(savefile.getAbsolutePath()+File.separator + multipartFile.getOriginalFilename());
                Files.copy(multipartFile.getInputStream(),path, StandardCopyOption.REPLACE_EXISTING);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        });
        movieModel.setImgUrl(urlList);
        adminService.addMovie(movieModel);
        return "redirect:/admin/addMovie";
    }

}
