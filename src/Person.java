/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Person.java                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: svan-nie <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/24 01:37:26 by svan-nie          #+#    #+#             */
/*   Updated: 2020/08/24 01:37:26 by svan-nie         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package src;

import src.Remote;

public class Person{
    private String name;
    private int age;
    private String brand;

    public Person(String name, int age, String brand)
    {
        this.name = name;
        this.age = age;
        this.brand = brand;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getBrand()
    {
        return brand;
    }

    public void switchOnTv()
    {
        TvRemoteSwitch tvOn = new TvRemoteSwitch(brand);
        tvOn.switchOn();
    }

    public void switchOffTv()
    {
        TvRemoteSwitch tvOff = new TvRemoteSwitch(brand);
        tvOff.switchOff();
    }
}