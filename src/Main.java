/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Main.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: svan-nie <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/24 01:39:22 by svan-nie          #+#    #+#             */
/*   Updated: 2020/08/24 01:39:22 by svan-nie         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package src;

import src.Person;
import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("Philips");
        list.add("Apple");
        list.add("samsung");

        Person shane = new Person("shane", 25, "Philips");
        // System.out.println(list.get(1));
        // if (shane.getBrand() == list.get(0))
        // {
        //     System.out.println(shane.getName()+ " "+shane.getAge());
        //     shane.switchOnTv();
        //     shane.switchOffTv();
        // }
        // else if (shane.getBrand() == list.get(1))
        // {
        //     System.out.println(shane.getName()+ " "+shane.getAge());
        //     shane.switchOnTv();
        //     shane.switchOffTv();
        // }
        // else if (shane.getBrand() == list.get(2))
        // {
        //     System.out.println(shane.getName()+ " "+shane.getAge());
            shane.switchOnTv();
            shane.switchOffTv();
        // }else
        // {
        //     System.out.println("Brand does not exist or has no stock");
        // }
    }
}