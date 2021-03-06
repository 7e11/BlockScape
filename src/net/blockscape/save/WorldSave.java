package net.blockscape.save;

import java.util.ArrayList;

import net.blockscape.world.WorldBlock;

public class WorldSave
{
    private String dispName;
    private ArrayList<WorldBlock> blocks;
    
    public WorldSave(String dispName_, ArrayList<WorldBlock> blocks_)
    {
        this.dispName = dispName_;
        this.blocks = blocks_;
    }
    
    public WorldSave(String dispName_)
    {
        this.dispName = dispName_;
        blocks = new ArrayList<WorldBlock>();
    }
    
    public String getName()
    {
        return dispName;
    }
    
    public void setName(String newName)
    {
        this.dispName = newName;
    }
    
    public ArrayList<WorldBlock> getBlocks()
    {
        return blocks;
    }
    
    public void updateBlocks(ArrayList<WorldBlock> blocks_)
    {
        this.blocks = blocks_;
    }
}
