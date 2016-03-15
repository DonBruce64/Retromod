package retro.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.EnumArt;
import net.minecraftforge.common.EnumHelper;
import retro.lib.RetroIds;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RetroItems {
	public static final EnumToolMaterial LINK = EnumHelper.addToolMaterial("LINK", 0, 1561, 12.9F, -2.0F, 25);
	public static final EnumArt MrMonopoly = EnumHelper.addArt("MrMonopoly", "MrMonopoly", 32, 32, 0, 160);
	public static final EnumArt Egadd = EnumHelper.addArt("Egadd", "Egadd", 32, 32, 32, 160);
	
	public static Item _8bitmario;
	public static Item _8bitlink;
	public static Item zeldasword;
	public static Item zeldabow;

	public static Item recordSMBOW;
	public static Item recordSMBUW;
	public static Item recordSMBWW;
	public static Item recordSMBC;
	
	public static Item recordSMB2T;
	public static Item recordSMB2CS;
	public static Item recordSMB2OW;
	
	public static Item recordSMB3OW1;
	public static Item recordSMB3OW1DT;
	public static Item recordSMB3OW2;
	public static Item recordSMB3OW2DT;
	public static Item recordSMB3UW;
	public static Item recordSMB3UWDT;
	public static Item recordSMB3C;
	public static Item recordSMB3CDT;
	public static Item recordSMB3B;
	public static Item recordSMB3BDT;
	public static Item recordSMB3BB;
	public static Item recordSMB3BBDT;
	public static Item recordSMB3S;
	public static Item recordSMB3QT;



	public static void init(){
		_8bitmario = new A8bitmario(RetroIds._8bitmario);
		_8bitlink = new A8bitlink(RetroIds._8bitlink);
		zeldasword = new Zeldasword(RetroIds.zeldasword, LINK);
		zeldabow = new Zeldabow(RetroIds.zeldabow);
		
		recordSMBOW= new RetroRecord(RetroIds.recordSMBOW, "Super Mario Bros -Overworld");
	    recordSMBUW= new RetroRecord(RetroIds.recordSMBUW, "Super Mario Bros -Underworld");
	    recordSMBWW= new RetroRecord(RetroIds.recordSMBWW, "Super Mario Bros -Waterworld");
	    recordSMBC= new RetroRecord(RetroIds.recordSMBC, "Super Mario Bros -Castle");
	    
	    recordSMB2T= new RetroRecord(RetroIds.recordSMB2T, "Super Mario Bros 2 -Title");
	    recordSMB2CS= new RetroRecord(RetroIds.recordSMB2CS, "Super Mario Bros 2 -Character Selection");
	    recordSMB2OW= new RetroRecord(RetroIds.recordSMB2OW, "Super Mario Bros 2 -Overworld");
	    
	    recordSMB3OW1= new RetroRecord(RetroIds.recordSMB3OW1, "Super Mario Bros 3 -Overworld1");
	    recordSMB3OW1DT= new RetroRecord(RetroIds.recordSMB3OW1DT, "Super Mario Bros 3 -Overworld1 Doubletime");
	    recordSMB3OW2= new RetroRecord(RetroIds.recordSMB3OW2, "Super Mario Bros 3 -Overworld2");
	    recordSMB3OW2DT= new RetroRecord(RetroIds.recordSMB3OW2DT, "Super Mario Bros 3 -Overworld2 Doubletime");
	    recordSMB3UW= new RetroRecord(RetroIds.recordSMB3UW, "Super Mario Bros 3 -Underworld");
	    recordSMB3UWDT= new RetroRecord(RetroIds.recordSMB3UWDT, "Super Mario Bros 3 -Underworld Doubletime");
	    recordSMB3C= new RetroRecord(RetroIds.recordSMB3C, "Super Mario Bros 3 -Castle");
	    recordSMB3CDT= new RetroRecord(RetroIds.recordSMB3CDT, "Super Mario Bros 3 -Castle Doubletime");
	    recordSMB3B= new RetroRecord(RetroIds.recordSMB3B, "Super Mario Bros 3 -Battle");
	    recordSMB3BDT= new RetroRecord(RetroIds.recordSMB3BDT, "Super Mario Bros 3 -Battle Doubletime");
	    recordSMB3BB= new RetroRecord(RetroIds.recordSMB3BB, "Super Mario Bros 3 -Boss Battle");
	    recordSMB3BBDT= new RetroRecord(RetroIds.recordSMB3BBDT, "Super Mario Bros 3 -Boss Battle Doubletime");
	    recordSMB3S= new RetroRecord(RetroIds.recordSMB3S, "Super Mario Bros 3 -Ship");
	    recordSMB3QT= new RetroRecord(RetroIds.recordSMB3QT, "Super Mario Bros 3 -Quadrupletime");
		}
	
	public static void addNames() {
		LanguageRegistry.addName(_8bitmario, A8bitmario._8bitmario_name);
		LanguageRegistry.addName(_8bitlink, A8bitlink._8bitlink_name);
		LanguageRegistry.addName(zeldasword, Zeldasword.zeldasword_name);
		LanguageRegistry.addName(zeldabow, Zeldabow.zeldabow_name);
		
		LanguageRegistry.addName(recordSMBOW, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMBUW, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMBWW, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMBC, RetroRecord.record_name);
		
		LanguageRegistry.addName(recordSMB2T, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB2CS, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB2OW, RetroRecord.record_name);
		
		LanguageRegistry.addName(recordSMB3OW1, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3OW1DT, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3OW2, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3OW2DT, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3UW, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3UWDT, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3C, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3CDT, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3B, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3BDT, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3BB, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3BBDT, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3S, RetroRecord.record_name);
		LanguageRegistry.addName(recordSMB3QT, RetroRecord.record_name);
		}
}
