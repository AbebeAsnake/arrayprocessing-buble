package com.abebe.arrayprocessing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
@RequestMapping("/")
    public String ArrProcessing(@RequestParam("number") int number){
        int[] myArray ={1,2,3,4,5,6};
        int sum=0;
         int temp=-myArray[0];
        String arrVal="";
          String tempVal="";
    for (int i = 0; i < myArray.length; i++)

    {
        arrVal += Integer.toString(myArray[i]);
    }
       for(int i=0;i<myArray.length;i++){

           for(int j=i+1;j<myArray.length;j++){
               if(myArray[i]<myArray[j]){
                    temp = myArray[i];
                    myArray[i]=myArray[j];
                    myArray[j]=temp;
               }
           }
       }
    for (int i = 0; i < myArray.length; i++)

    {
        tempVal +=Integer.toString(myArray[i]);

        sum+=myArray[i];
        System.out.print(myArray[i]+ ",");
    }

    int avg =sum/myArray.length;

       return "Array:"+"[" + arrVal+"]"+"<br/>"+"sorted Array:["+tempVal+"]<br/>" + "Sum :" +Integer.toString(sum) +"<br/>"+"Average: " +Integer.toString(avg);
    }
}
