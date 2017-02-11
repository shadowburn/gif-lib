package com.jizizhang.giflib.controller;

import com.jizizhang.giflib.data.GifRepository;
import com.jizizhang.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FavoritesController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/favorites")
    public String listFavorites(ModelMap modelMap){
        List<Gif> gifs = gifRepository.getAllFavorites();
        modelMap.put("gifs", gifs);
        return "favorites";
    }
}
