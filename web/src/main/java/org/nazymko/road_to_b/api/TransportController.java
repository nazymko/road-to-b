package org.nazymko.road_to_b.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by nazymko.patronus@gmail.com.
 */
@Controller
@RequestMapping("transport")
public class TransportController {

    @RequestMapping(method = RequestMethod.POST)
    public Object register(Model model) {
        return "ok";
    }

    @RequestMapping(method = RequestMethod.GET)
    public Object registerGet(Model model) {
        return "GET from registerGet";
    }
}
