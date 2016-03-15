package retro.lib;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.World;

public class Zombieovereide extends EntityZombie{

	public Zombieovereide(World par1World) {
		super(par1World);
	}
	
	@Override
    protected void applyEntityAttributes(){
    	super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(16.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.23000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(3.0D);
        this.getAttributeMap().func_111150_b(field_110186_bp).setAttribute(this.rand.nextDouble() * 0.10000000149011612D);
    }
}
