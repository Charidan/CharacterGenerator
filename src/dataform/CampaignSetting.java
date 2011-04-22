/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataform;

import java.util.ArrayList;

/**
 *
 * @author Julian/Charidan
 */
public abstract class CampaignSetting
{
    private String name;
    private String description;
    private ArrayList<Region> regions = new ArrayList<Region>();

    public String getName() { return name; }
    public String getDescription() { return description; }
    public ArrayList<Region> getRegions() { return regions; }
}
