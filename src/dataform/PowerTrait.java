/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataform;

/**
 *
 * @author Julian
 */
public abstract class PowerTrait
{
    ProgressionType progType;
    private String description;
    private String type;

    public String getDescription() { return description; }
    public String getType() { return type; }
    public abstract String getProgValue(int scalar, int offset, int dieSize);
}
