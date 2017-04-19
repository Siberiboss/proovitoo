package com.example.jersey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Jonas on 4/17/2017.
 */
@Controller
public class DataController {


    @Autowired
    private IDataDao dataDao;

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public String searchData(HttpServletRequest request) {

        String insert = request.getParameter("insert");
        Data data = new Data(insert);

        if (!(insert == null || insert.equals(""))) {
            dataDao.save(data);
        }
        return "dataform";
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String getData(HttpServletRequest request, Model model) {
        List<Data> dataList = dataDao.findDataByString(request.getParameter("search"));


        String search = request.getParameter("search");
        if (search == null) {
            return "dataform";
        } else {
            model.addAttribute("search", search);
            model.addAttribute("dataList", dataList);
            return "datasearch";
        }
    }
}
