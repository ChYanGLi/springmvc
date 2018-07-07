package com.Lee.Controller;

import com.Lee.Model.BookModel;
import com.Lee.Model.UserModel;
import com.Lee.Util.StringUtil;
import com.Lee.api.QueryBooksService;
import com.Lee.api.QueryUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class SpringMVC {
    @Resource
    private QueryUserService queryUserService;
    @Resource
    private QueryBooksService queryBooksService;
    {
        System.out.println("SpringMVC Controller !");
    }
    @RequestMapping("/Index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("Index");
        view.addObject("welcome", "hello world !");
        return view;
    }
    /**  @RequestMapping(value = "/login",method = RequestMethod.POST)  //通过注解获取From 传输的值
    public ModelAndView login(@RequestParam("userName") String userName, @RequestParam("password") String password){
           UserModel userModel=new UserModel();
           userModel.setUserName(userName);
           userModel.setPassword(password);
    **/
    @RequestMapping(value = "/Checked")   //  通过Bean获取前端数据
    public ModelAndView login(UserModel userModel){
       // System.out.println(userModel.getUserName()+"   "+userModel.getPassword());
        String viewName;
        ModelAndView view;
        if (doCheck(userModel)) {
            viewName = "HomeBook";
           List<BookModel> bookList=queryBooksService.queryBookListService();
            view = new ModelAndView(viewName);
            view.addObject("bookList",bookList);

        } else {
            viewName = "Login";
            view = new ModelAndView(viewName);
            view.addObject("sorry", "Sorry , Login failed !  ");
        }
        return view;
    }

     private boolean doCheck( UserModel userModel){
         UserModel user = queryUserService.queryByName(userModel.getUserName());
         if (StringUtil.compare(user.getPassword(),userModel.getPassword()))
             return true;
         else return false;
     }


}
