/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   TvRemoteSwitch.java                                :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: svan-nie <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/24 01:48:09 by svan-nie          #+#    #+#             */
/*   Updated: 2020/08/24 01:48:09 by svan-nie         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package src;

import src.Remote;
import src.Tv;

public class TvRemoteSwitch implements Remote{

    public String tvbrand;

    public TvRemoteSwitch(String tvbrand)
    {
        this.tvbrand = tvbrand;
    }
    public void switchOn()
    {
        // System.out.println("Tv Switched On");
        if (tvbrand == "Philips")
        {
            Tv tvName = new Tv(tvbrand);
            tvName.switchOn();
        }
        else if (tvbrand == "Apple")
        {
            Tv tvName = new Tv(tvbrand);
            tvName.switchOn();
        }
        else if (tvbrand == "samsung")
        {
            Tv tvName = new Tv(tvbrand);
            tvName.switchOn();
        }
        else 
        {
            System.out.println("Brand does not exist or out of stock");
        }
    }
    public void switchOff()
    {
        // System.out.println("Tv Switched Off");
        if (tvbrand == "Philips")
        {
            Tv tvName = new Tv(tvbrand);
            tvName.switchOff();
        }
        else if (tvbrand == "Apple")
        {
            Tv tvName = new Tv(tvbrand);
            tvName.switchOff();
        }
        else if (tvbrand == "samsung")
        {
            Tv tvName = new Tv(tvbrand);
            tvName.switchOff();
        }
        else 
        {
            System.out.println("Brand does not exist or out of stock");
        }
    }
}