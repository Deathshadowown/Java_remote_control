/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Tv.java                                            :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: svan-nie <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/24 02:03:53 by svan-nie          #+#    #+#             */
/*   Updated: 2020/08/24 02:03:53 by svan-nie         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package src;

import src.TvRemoteSwitch;
import java.util.*;
// import java.util.concurrent.CopyOnWriteArrayList;

public class Tv{
    public String tvName;
    // private CopyOnWriteArrayList<String> tvlist = new CopyOnWriteArrayList<String>();
    
    public Tv(String tvName)
    {
        this.tvName = tvName;
    }

    public String getTvName()
    {
        return tvName;
    }
    
    public void switchOn()
    {
        // System.out.println(tvList[0]);
        
        System.out.println(tvName+" Tv Switched On");
    }
    public void switchOff()
    {
        System.out.println(tvName+" Tv Switched Off");
    }
}