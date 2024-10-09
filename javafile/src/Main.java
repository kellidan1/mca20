/**
 * Main Class which creates objects for all classes.
*/


/* Author Name: Kellidan Fernandes
Roll No.:       20
Title:          Education Institutes of India
Start Date:     10 July 2024
Modified Date:  24 July 2024
Description:    -Creates University,  Arts and Science Colleges, 
                Institute of National Importance and Business School parent classes
                -creates child classes GoaUniversity, IITBombay and DelhiUniversity 
                inherting from parent University Class
                -creates child class StXavierCollege inherting from parent class ArtsScienceCollege
                -creates child class AIIMS inherting from parent class InstituteOfNationalImportance
                -creates child class IIMAhmedabad inherting from parent class BusinessSchool

*/
/**
 * Default constructor for Main class.
 */
public class Main {
  /**
     * The main method, which serves as the entry point for the application.
     *
     * @param args the command line arguments
  */
  public static void main(String[] args) {
        // Uni sub1
        IITBombay iitBombay = new IITBombay();
        iitBombay.displayInfo();
        iitBombay.offerCourses();
        iitBombay.conductExams();
        iitBombay.grantDegrees();

        System.out.println();

        // Uni sub2
        DelhiUniversity delhiUniversity = new DelhiUniversity();
        delhiUniversity.displayInfo();
        delhiUniversity.organizeWorkshops();
        delhiUniversity.evaluateAssignments();
        delhiUniversity.provideFacilities();
        System.out.println();

        // Uni sub3
        GoaUniversity GU= new GoaUniversity();
        GU.displayInfo();
        GU.degreesgranted();
        GU.examsconducted();
        GU.programmesOffered();
        System.out.println();

        // Institutes of National Importance
        AIIMS aiims = new AIIMS();
        aiims.displayInfo();
        aiims.medicalTraining();
        aiims.clinicalResearch();

        System.out.println();

        // Arts and Science Colleges
        StXaviersCollege stXaviers = new StXaviersCollege();
        stXaviers.displayInfo();
        stXaviers.teach();
        stXaviers.assess();

        System.out.println();

        // Business Schools
        IIMAhmedabad iimAhmedabad = new IIMAhmedabad();
        iimAhmedabad.displayInfo();
        iimAhmedabad.MBAProgram();
        iimAhmedabad.caseStudies();

    }
}




































































































































































/* 


function CommonFun.calcFinalDam(srcUser, targetUser, params, logger)
  local Weapon_Id = srcUser:GetEquipedID(7_WEAPON)
  local Damage_Per = 0
  if Weapon_Id == 40610 or Weapon_Id == 140610 then
    local target_Hp = targetUser:GetProperty("Hp")
    local target_MaxHp = targetUser:GetProperty("MaxHp")
    local target_hpper = target_Hp / target_MaxHp
    if srcUser:HasBuffID(90000924_LICH_STAFF_1_R5_:MAX_STACK_0) and target_hpper <= 0.3 then
      Damage_Per = Damage_Per + 0.15
    end
    if srcUser:HasBuffID(90000925_LICH_STAFF_1_R6_:MAX_STACK_0) and target_hpper <= 0.1 then
      Damage_Per = Damage_Per + 0.3
    end
    if srcUser:HasBuffID(90000928_LICH_STAFF_1_R9_:MAX_STACK_0) and target_hpper <= 0.45 then
      Damage_Per = Damage_Per + 0.05
    end
    local RefineLv1 = srcUser:GetEquipedRefineLv(7_WEAPON)
    if srcUser:HasBuffID(90000929_LICH_STAFF_1_R10_:MAX_STACK_0) and 15 <= RefineLv1 then
      Damage_Per = Damage_Per + 0.1
    end
  end
  if srcUser:HasBuffID(44280_GARM_S_NAIL_:MAX_STACK_0) then
    local target_Hp = targetUser:GetProperty("Hp")
    local target_MaxHp = targetUser:GetProperty("MaxHp")
    local target_hpper = target_Hp / target_MaxHp
    if target_hpper <= 0.3 then
      Damage_Per = Damage_Per + 0.5
    end
  end
  if Weapon_Id == 41565 or Weapon_Id == 141565 then
    local target_Hp8 = targetUser:GetProperty("Hp")
    local target_MaxHp8 = targetUser:GetProperty("MaxHp")
    local target_hpper8 = target_Hp8 / target_MaxHp8
    if srcUser:HasBuffID(41970_HAMMER_OF_JUDGEMENT_:MAX_STACK_0) and target_hpper8 <= 0.3 then
      Damage_Per = Damage_Per + 0.15
    end
  end
  if srcUser:HasBuffID(65460_5170_:MAX_STACK_0) then
    local target_HpW = targetUser:GetProperty("Hp")
    local target_MaxHpW = targetUser:GetProperty("MaxHp")
    local target_hpperW = target_HpW / target_MaxHpW
    local RefineLv12 = srcUser:GetEquipedRefineLv(12)
    if target_hpperW <= 0.3 or 10 <= RefineLv12 and target_hpperW <= 0.6 then
      Damage_Per = Damage_Per + 0.1
    end
  end
  if srcUser:HasBuffID(72210_12136_:MAX_STACK_0) then
    local target_Hp = targetUser:GetProperty("Hp")
    local target_MaxHp = targetUser:GetProperty("MaxHp")
    local target_hpper = target_Hp / target_MaxHp
    if target_hpper <= 0.3 then
      Damage_Per = Damage_Per + 0.15
    end
  end
  if srcUser:HasBuffID(75870_3009142_GOLD_MEDAL_BREAD_KING_1_:MAX_STACK_0) then
    local target_Hp = targetUser:GetProperty("Hp")
    local target_MaxHp = targetUser:GetProperty("MaxHp")
    local target_hpper = target_Hp / target_MaxHp
    if 0.7 < target_hpper then
      Damage_Per = Damage_Per + 0.1
    end
  end
  local shenqi = 0
  if srcUser:HasBuffID(107031_SPLITTING_BAMBOO_50_:MAX_STACK_0) then
    shenqi = 0.5
  elseif srcUser:HasBuffID(107030_SPLITTING_BAMBOO_30_:MAX_STACK_0) then
    shenqi = 0.3
  end
  local Godness = 0
  if srcUser:HasBuffID(31790_LOVE_GODDESS_:MAX_STACK_0) then
    Godness = 0.1
  end
  local GreatbuffD = 0
  if srcUser:HasBuffID(166580_DOUBLE_EDGE_SWORD_:MAX_STACK_0) then
    GreatbuffD = 0.3
  end
  local testbuff = 0
  local Num33 = targetUser:GetStatusNum()
  if 3 <= Num33 and srcUser:HasBuffID(65100_505_:MAX_STACK_0) then
    testbuff = 10
  end
  local Personalartifact = 0
  local NumDebuff = targetUser:GetStatusNum()
  if srcUser:HasBuffID(49230_7894_:MAX_STACK_0) then
    Personalartifact = 0.08 * NumDebuff
  end
  local Cardsnake = srcUser:GetEquipCardNum(7, 23315_WORLD_SERPENT_CARD)
  if srcUser:HasBuffID(57480_JORMUNGANDR_CARD_:MAX_STACK_0) then
    Personalartifact = Personalartifact + 0.02 * NumDebuff * Cardsnake
  end
  local RefineLv4 = srcUser:GetEquipedRefineLv(4)
  if targetUser:GetNpcID() ~= 0 and srcUser:HasBuffID(57740_ANCIENT_MYSTELTAINN_CARD_:MAX_STACK_0) and 1 <= NumDebuff then
    Personalartifact = Personalartifact + 0.1 + RefineLv4 * 0.01
  end
  if srcUser:HasBuffID(75480_23_:MAX_STACK_0) and 1 <= NumDebuff then
    Personalartifact = Personalartifact + 0.1 + 0.02 * NumDebuff
  end
  local count = params.hitedCount
  local DemonLeader = 0
  if srcUser:HasBuffID(57200_DEVIL_GOVERNOR_CARD_:MAX_STACK_0) and srcUser:HasBuffID(81002810_13331_:MAX_STACK_0) then
    DemonLeader = 0.1
  elseif srcUser:HasBuffID(57200_DEVIL_GOVERNOR_CARD_:MAX_STACK_0) and 1 <= count then
    DemonLeader = 0.1 / count
  end
  if srcUser:HasBuffID(75850_3009140_WEIRD_FLAVORED_TOAST_MEOW_:MAX_STACK_0) and 1 <= count then
    DemonLeader = DemonLeader + math.min(0.02 * count, 0.06)
  end
  local Transmission = 0
  local SecretLandGemLv = srcUser:GetSecretLandGemLv(384002)
  local targetid = targetUser:GetGuid()
  local distance = srcUser:GetDistance(targetid)
  if SecretLandGemLv ~= 0 and 6 <= distance and srcUser:HasBuffID(48610_TRANSMISSION_GEM_:MAX_STACK_0) then
    Transmission = SecretLandGemLv * 0.002 + math.max(SecretLandGemLv - 30, 0) * 0.001 + math.max(SecretLandGemLv - 60, 0) * 0.002
  end
  local Handtohand = 0
  local HandSecretLandGemLv = srcUser:GetSecretLandGemLv(384005)
  if HandSecretLandGemLv ~= 0 and distance <= 5 and srcUser:GetRangeVaildEnemy(5) == 1 then
    Handtohand = HandSecretLandGemLv * 0.002 + math.max(HandSecretLandGemLv - 30, 0) * 0.001 + math.max(HandSecretLandGemLv - 60, 0) * 0.002
  end
  local Thunder = 0
  local ThunderSecretLandGemLv = srcUser:GetSecretLandGemLv(384003)
  if ThunderSecretLandGemLv ~= 0 and srcUser:HasBuffID(48621_ROARING_GEM_:MAX_STACK_0) then
    Thunder = ThunderSecretLandGemLv * 0.002 + math.max(ThunderSecretLandGemLv - 30, 0) * 0.001 + math.max(ThunderSecretLandGemLv - 60, 0) * 0.002
  end
  local Mineral = 0
  local Numabnormal = targetUser:GetStatusNum()
  if srcUser:HasBuffID(55210_ORE_SPIRIT_CARD_MINI_:MAX_STACK_0) then
    Mineral = Numabnormal * 0.05
  end
  local GreatbuffNum = targetUser:GetBuffLayer(165536_BASH_:MAX_STACK_20)
  local GreatNum = 0
  if srcUser:HasBuffID(165535_BASH_:MAX_STACK_0) then
    GreatNum = GreatbuffNum * 0.05
  end
  local Hide = 0
  if srcUser:HasBuffID(107098_VOID_HIDING_:MAX_STACK_0) then
    Hide = 0.3
  elseif srcUser:HasBuffID(107099_VOID_HIDING_:MAX_STACK_0) then
    Hide = 0.6
  end
  local WeaponType = srcUser:GetEquipedWeaponType()
  local WeaponType2 = targetUser:GetEquipedWeaponType()
  local skilllv_1 = srcUser:GetLernedSkillLevel(1146_ARCANE_MASTER:COUNTER_INSTINCT)
  local Overlord = 0
  local GemValue = srcUser:GetGemValue(91092_COUNTER_INSTINCT_DMG_INCREASING_EFFECT_PERCENTAGE)
  if WeaponType == 250 and (WeaponType2 == 180 or WeaponType2 == 250) then
    Overlord = skilllv_1 * 0.02 + GemValue / 100000
  end
  local dragon = 0
  local Dtarget_Hp = targetUser:GetProperty("Hp")
  local Dtarget_MaxHp = targetUser:GetProperty("MaxHp")
  local Dtarget_hpper = Dtarget_Hp / Dtarget_MaxHp
  if srcUser:HasBuffID(33410_WINDPERCH_DRAKE_:MAX_STACK_0) and 0.5 <= Dtarget_hpper then
    dragon = 0.05
  end
  if srcUser:HasBuffID(55740_11920_:MAX_STACK_0) and 0.5 <= Dtarget_hpper then
    dragon = dragon + 0.05
  end
  if srcUser:HasBuffID(55740_11920_:MAX_STACK_0) and srcUser:HasBuffID(81001690_10401_:MAX_STACK_0) and Dtarget_hpper < 0.5 then
    dragon = dragon + 0.05
  end
  local Devilballs = 0
  local Dtarget_Hp = targetUser:GetProperty("Hp")
  local Dtarget_MaxHp = targetUser:GetProperty("MaxHp")
  local Dtarget_hpper = Dtarget_Hp / Dtarget_MaxHp
  if srcUser:HasBuffID(68390_7208_:MAX_STACK_0) and 0.7 <= Dtarget_hpper then
    Devilballs = 0.05
  end
  local staff = 0
  local RefineLvH = srcUser:GetEquipedRefineLv(7_WEAPON)
  local Sp = srcUser:GetProperty("Sp")
  local MaxSp = srcUser:GetProperty("MaxSp")
  if 10 <= RefineLvH and srcUser:HasBuffID(44310_STAFF_OF_DESTRUCTION_:MAX_STACK_0) then
    staff = math.floor((MaxSp - Sp) / MaxSp * 10) / 100
  end
  local sword = 0
  local Dtarget_Sp = targetUser:GetProperty("Sp")
  local Dtarget_MaxSp = targetUser:GetProperty("MaxSp")
  local Dtarget_spper = Dtarget_Sp / Dtarget_MaxSp
  if srcUser:HasBuffID(43160_DARK_FIRE_SWORD_:MAX_STACK_0) and Dtarget_spper < 0.5 then
    sword = 0.2
  end
  local Dagger = 0
  local DaggerRate = 10
  local RefineLv = srcUser:GetEquipedRefineLv(7_WEAPON)
  if 5 <= RefineLv and RefineLv < 10 then
    DaggerRate = DaggerRate + 5
  elseif 10 <= RefineLv and RefineLv < 15 then
    DaggerRate = DaggerRate + 5 + 5
  elseif 15 <= RefineLv then
    DaggerRate = DaggerRate + 5 + 5 + 10
  end
  if srcUser:HasBuffID(43170_DEMON_KNIFE_SWALLOW_:MAX_STACK_0) and CommonFun.IsInRate(DaggerRate, srcUser:GetRandom()) then
    Dagger = 1
  end
  local atls = 0
  local RefineLv9 = srcUser:GetEquipedRefineLv(8)
  if srcUser:HasBuffID(33980_STROUF_HEADWEAR_1_:MAX_STACK_0) and Dtarget_hpper <= 0.4 then
    atls = 0.04 + RefineLv9 * 0.01
  end
  local tail = 0
  if srcUser:HasBuffID(64690_3913_:MAX_STACK_0) and Dtarget_hpper <= 0.4 then
    tail = 0.1
  end
  local Whale = 0
  local WsrcUser_Hp = srcUser:GetProperty("Hp")
  local Wtarget_Hp = targetUser:GetProperty("Hp")
  local Wtarget_hpper = WsrcUser_Hp / Wtarget_Hp
  if srcUser:HasBuffID(36150_3000040_WHALE_PRINCE_:MAX_STACK_0) and 1 < Wtarget_hpper then
    Whale = 0.05
  end
  local Ignore = 0
  local IgnoreMDefHS = srcUser:GetProperty("IgnoreMDef")
  local MDefPerHS = targetUser:GetProperty("MDefPer")
  local pvpReduceHS = 0
  local mapid, maptype = srcUser:GetMapInfo()
  if (maptype == PVP_MAPS) and targetUser:GetNpcID() ~= 40022_EMPERIUM then
    MDefPerHS = MDefPerHS < -1 and -1 or 1 < MDefPerHS and 1 or MDefPerHS
    MDefPerHS = math.floor(MDefPerHS * 1000) / 1000
    MDefPerHS = MDefPerHS + 0.5 * (1 - math.sin(MDefPerHS * 3.14 / 2))
    local Master = targetUser:GetMasterUser()
    if targetUser:GetNpcID() == 0 or Master ~= nil then
      pvpReduceHS = 0.2
    end
  end
  local RealMDefPer = IgnoreMDefHS - MDefPerHS - pvpReduceHS
  if srcUser:HasBuffID(90003144_8985_:MAX_STACK_0) and 1 <= RealMDefPer then
    Ignore = 0.1
  end
  if srcUser:HasBuffID(90004284_WIZARD_S_POWER_1_T5_:MAX_STACK_0) and 1 <= RealMDefPer then
    Ignore = Ignore + 0.1
  end
  local StateEffect = targetUser:GetProperty("StateEffect")
  local bits = CommonFun.getBits(StateEffect)
  local CardNum = srcUser:GetEquipCardNum(7, 23035_LORD_OF_DEATH_CARD)
  local CardDie = 0
  local CardS = 0
  if (bits[CommonFun.StateEffect.Dizzy] == 1 or bits[CommonFun.StateEffect.Curse] == 1 or bits[CommonFun.StateEffect.Silence] == 1 or bits[CommonFun.StateEffect.Blood] == 1 or bits[CommonFun.StateEffect.Poison] == 1) and srcUser:HasBuffID(81000700_LORD_OF_DEATH_CARD_:MAX_STACK_0) and 0 < CardNum then
    CardS = 0.05
  end
  if (bits[CommonFun.StateEffect.Dizzy] == 1 or bits[CommonFun.StateEffect.Curse] == 1 or bits[CommonFun.StateEffect.Silence] == 1 or bits[CommonFun.StateEffect.Blood] == 1 or bits[CommonFun.StateEffect.Poison] == 1) and 0 < CardNum then
    CardDie = 0.2 * CardNum + CardS
  end
  local kaimeila = 0
  if srcUser:HasBuffID(53020_CHIMERA_CARD_:MAX_STACK_0) and bits[CommonFun.StateEffect.Poison] == 1 then
    kaimeila = kaimeila + 0.2
  end
  if srcUser:HasBuffID(80001710_CHIMERA_CARD_DEPOSITE_:MAX_STACK_0) and bits[CommonFun.StateEffect.Poison] == 1 then
    kaimeila = kaimeila + 0.05
  end
  local Profession = srcUser:GetProfressionID()
  if srcUser:HasBuffID(53130_WITHOUT_A_TRACE_:MAX_STACK_0) and bits[CommonFun.StateEffect.Poison] == 1 and (Profession == 32_ASSASSIN or Profession == 33_ASSASSIN_CROSS or Profession == 34_GUILLOTINE_CROSS or Profession == 35_BLADE_SOUL) then
    kaimeila = kaimeila + 0.1
  end
  if (srcUser:HasBuffID(55350_6505_:MAX_STACK_0) or srcUser:HasBuffID(56680_11922_:MAX_STACK_0)) and bits[CommonFun.StateEffect.Poison] == 1 then
    kaimeila = kaimeila + 0.2
  end
  if srcUser:HasBuffID(55750_9575_:MAX_STACK_0) and bits[CommonFun.StateEffect.Poison] == 1 then
    kaimeila = kaimeila + 0.1
  end
  if srcUser:HasBuffID(57820) and bits[CommonFun.StateEffect.Poison] == 1 then
    kaimeila = kaimeila + 0.1
  end
  if srcUser:HasBuffID(61005150_13319_:MAX_STACK_0) and bits[CommonFun.StateEffect.Poison] == 1 then
    kaimeila = kaimeila + 0.01
  end
  local GunBlood = 0
  if srcUser:HasBuffID(55800_9904_:MAX_STACK_0) and bits[CommonFun.StateEffect.Blood] == 1 then
    GunBlood = GunBlood + 0.1
  end
  if srcUser:HasBuffID(57870) and bits[CommonFun.StateEffect.Blood] == 1 then
    GunBlood = GunBlood + 0.1
  end
  if srcUser:HasBuffID(57870) and bits[CommonFun.StateEffect.Blood] == 1 and (Profession == 173_GUNSLINGER or Profession == 174_REBELLION or Profession == 175_TYRANT) then
    GunBlood = GunBlood + 0.05
  end
  local InkSnake = 0
  if srcUser:HasBuffID(57530_DARK_SNAKE_LORD_CARD_:MAX_STACK_0) and (bits[CommonFun.StateEffect.Dark] == 1 or bits[CommonFun.StateEffect.Curse] == 1) then
    InkSnake = InkSnake + 0.15
  end
  local Burndamage = 0
  if srcUser:HasBuffID(81003540_13332_:MAX_STACK_0) and bits[CommonFun.StateEffect.Burn] == 1 then
    Burndamage = Burndamage + 0.01
  end
  local Frozendamage = 0
  if srcUser:HasBuffID(76350_3009162_PORING_ICE_CUBES_:MAX_STACK_0) and bits[CommonFun.StateEffect.Freeze] == 1 then
    Frozendamage = Frozendamage + 0.1
  end
  local HpM = srcUser:GetProperty("Hp")
  local MaxHpM = srcUser:GetProperty("MaxHp")
  local hpperM = HpM / MaxHpM
  local tiger = 0
  if srcUser:HasBuffID(52980_REVENANT_EDDGA_CARD_:MAX_STACK_0) then
    tiger = math.floor((1 - hpperM) * 10) * 0.02
  end
  local robot = 0
  if srcUser:HasBuffID(69100_8107_:MAX_STACK_0) then
    robot = math.floor((1 - hpperM) * 100) * 0.001
  end
  local queen = 0
  local Num_queen = targetUser:GetBuffLayer(53561_UNDEAD_MISTRESS_CARD_BLEED_:MAX_STACK_3)
  if Profession == 82_SAGE or Profession == 83_PROFESSOR or Profession == 84_SORCERER or Profession == 85_CHRONOMANCER or Profession == 21_MAGE or Profession == 22_WIZARD or Profession == 23_HIGH_WIZARD or Profession == 24_WARLOCK or Profession == 25_ARCANE_MASTER or Profession == 22_WIZARD3 or Profession == 22_WIZARD4 or Profession == 22_WIZARD5 or Profession == 635_SHADOW_GENOS or Profession == 675_JORMUNGANDR or Profession == 695_ANCIENT_ARTIFACT_USER then
    queen = Num_queen * 0.05
  end
  local Danatos = 0
  local Def2 = targetUser:GetProperty("Def")
  local DefPer2 = targetUser:GetProperty("DefPer")
  local Vit2 = targetUser:GetProperty("Vit")
  local VitPer2 = targetUser:GetProperty("VitPer")
  local CardDanatos = srcUser:GetEquipCardNum(7, 23350_ALIEN_RUNEMASTER_THANATOS_CARD)
  if 0 < CardDanatos then
    Danatos = math.min(math.floor(((Def2 - Vit2) * (1 + DefPer2) + Vit2 * (1 + VitPer2)) / 50) * 0.001, 0.1) * CardDanatos
  end
  local MaxSp1 = srcUser:GetProperty("MaxSp")
  local Image = 0
  if srcUser:HasBuffID(56600_ALIEN_PUPPET_CARD_:MAX_STACK_0) then
    Image = math.floor(MaxSp1 / 1000) * 0.001
  end
  local Ball = 0
  local Num_ball = targetUser:GetBuffLayer(210011_HOLD_VULNERABILITY_BUFF_CAN_STACK_:MAX_STACK_20)
  local skill_ball = 0
  local RaidType = srcUser:GetRaidType()
  if RaidType == 32 then
    if srcUser:HasBuffID(107340_MASTER_TACKLER_LV_1_:MAX_STACK_0) then
      skill_ball = 0.07
    elseif srcUser:HasBuffID(107341_MASTER_TACKLER_LV_2_:MAX_STACK_0) then
      skill_ball = 0.14
    elseif srcUser:HasBuffID(107342_MASTER_TACKLER_LV_3_:MAX_STACK_0) then
      skill_ball = 0.21
    elseif srcUser:HasBuffID(107343_MASTER_TACKLER_LV_4_:MAX_STACK_0) then
      skill_ball = 0.28
    end
    if 0 < Num_ball and srcUser:HasBuffID(210030_INCREASE_DMG_TO_HOLDER_:MAX_STACK_0) then
      Ball = Num_ball * Num_ball / 200 + skill_ball + 0.5
    elseif 0 < Num_ball then
      Ball = Num_ball * Num_ball / 200 + skill_ball
    end
  end
  if RaidType == 44 then
    if srcUser:HasBuffID(107340_MASTER_TACKLER_LV_1_:MAX_STACK_0) and targetUser:HasBuffID(210200_CAPTURE_THE_CHESS_PIECE_:MAX_STACK_0) then
      Ball = 0.04
    elseif srcUser:HasBuffID(107341_MASTER_TACKLER_LV_2_:MAX_STACK_0) and targetUser:HasBuffID(210200_CAPTURE_THE_CHESS_PIECE_:MAX_STACK_0) then
      Ball = 0.08
    elseif srcUser:HasBuffID(107342_MASTER_TACKLER_LV_3_:MAX_STACK_0) and targetUser:HasBuffID(210200_CAPTURE_THE_CHESS_PIECE_:MAX_STACK_0) then
      Ball = 0.12
    elseif srcUser:HasBuffID(107343_MASTER_TACKLER_LV_4_:MAX_STACK_0) and targetUser:HasBuffID(210200_CAPTURE_THE_CHESS_PIECE_:MAX_STACK_0) then
      Ball = 0.16
    end
  end
  local kb = 0
  if srcUser:HasBuffID(124200_ASPHYXIA_INVINCIBLE_:MAX_STACK_0) and targetUser:HasBuffID(124180_DEATH_BINDING_:MAX_STACK_0) then
    local skilllv = srcUser:GetLernedSkillLevel(3024_BLACKSMITH:ASPHYXIA_JOINT_BURIAL)
    kb = skilllv * 0.05
  end
  local gz = 0
  if srcUser:HasBuffID(129550_LIFE_PERCEPTION_:MAX_STACK_0) then
    local skilllv = srcUser:GetLernedSkillLevel(3709_ROYAL_GUARD:LIFE_PERCEPTION)
    local skilllv2 = srcUser:GetLernedSkillLevel(4409_CHRONOMANCER:LIFE_PERCEPTION)
    local skilllv4 = srcUser:GetLernedSkillLevel(1741_ARCHER:LIFE_PERCEPTION)
    local Hiding = targetUser:GetProperty("Hiding")
    local Hp = targetUser:GetProperty("Hp")
    local MaxHp = targetUser:GetProperty("MaxHp")
    local skilllv3 = srcUser:GetLernedSkillLevel(4426_ROGUE:LIFE_PERCEPTION_SNEAKY_RAID)
    local skilllv5 = srcUser:GetLernedSkillLevel(1742_ARCHER:LIFE_PERCEPTION_SNEAKY_RAID)
    if Hiding == 1 and Hp <= MaxHp * ((skilllv + skilllv2 + skilllv4) * 0.04 + 0.1) then
      gz = (skilllv + skilllv2 + skilllv4) * 0.04 + 0.1 + (skilllv3 + skilllv5) * 0.04
    end
  end
  local SunHate = 0
  if srcUser:HasBuffID(136250_WRATH_OF_THE_SUN_:MAX_STACK_0) then
    local skilllv = srcUser:GetLernedSkillLevel(2422_PRIEST:WRATH_OF_THE_SUN)
    if CommonFun.GetSunMark(srcUser, targetUser) then
      local Value = srcUser:GetGemValue(193021_INCREASES_THE_DAMAGE_DEALT_TO_UNIT_TARGETED_BY_HATRED_OF_THE_SUN_BY_PERCENTAGE)
      SunHate = skilllv * 0.05 + Value / 100000
    end
  end
  local Mvp_blood = 0
  if srcUser:HasBuffID(159750_BLOODBATH_:MAX_STACK_0) then
    local Hp = srcUser:GetProperty("Hp")
    local MaxHp = srcUser:GetProperty("MaxHp")
    Mvp_blood = (MaxHp - Hp) / MaxHp * 5
  end
  local Final = 1 + Damage_Per + shenqi + Godness + Hide + Overlord + dragon + CardDie + tiger + kaimeila + atls + Ball + Whale + queen + kb + gz + sword + Dagger + testbuff + GreatNum + GreatbuffD + tail + Mineral + staff + Devilballs + Personalartifact + robot + Ignore
  Final = Final + SunHate + Mvp_blood + Danatos + Image + GunBlood + Transmission + Handtohand + InkSnake + Thunder + DemonLeader + Burndamage + Frozendamage
  local huangjing = 0
  if srcUser:HasBuffID(180005_ELITE_MONSTER_DMG_BONUS_:MAX_STACK_0) and targetUser.isRareElite then
    local jingying = srcUser:GetBuffLayer(180005_ELITE_MONSTER_DMG_BONUS_:MAX_STACK_0)
    huangjing = jingying * 0.25
    Final = Final + huangjing
  end
  if srcUser:HasBuffID(161350_HAS_LOVE_:MAX_STACK_0) or srcUser:HasBuffID(33571_RENOVATIO_:MAX_STACK_0) then
    Final = 0
  end
  local skillParams = Table_Skill[params.skillIDAndLevel]
  if srcUser:HasBuffID(174829_INK_SPLASH_EMPTY_BUFF_:MAX_STACK_0) and CommonFun.RollType.Attack == skillParams.RollType and targetUser:GetNpcID() == 30064_DEVIL_SQUID then
    Final = 0
  end
  return Final
end













function CommonFun.DoCalcStateEffectDam(srcUser, targetUser, params)
  local StateEffect = targetUser:GetProperty("StateEffect")
  local bits = CommonFun.getBits(StateEffect)
  local Weapon = srcUser:GetEquipedID(7_WEAPON)
  local RefineLv = srcUser:GetEquipedRefineLv(7_WEAPON)
  local Profession = srcUser:GetProfressionID()
  local Num1 = srcUser:GetRunePoint(31011_AESIR_DEALS_10_MORE_DAMAGE_TO_STUNNED_TARGETS)
  local Num2 = srcUser:GetRunePoint(31012_AESIR_DEALS_5_MORE_DAMAGE_TO_STUNNED_TARGETS)
  local Num3 = srcUser:GetRunePoint(31013_AESIR_DEALS_10_MORE_DAMAGE_TO_STUNNED_TARGETS)
  local Num4 = srcUser:GetRunePoint(31014_AESIR_DEALS_5_MORE_DAMAGE_TO_STUNNED_TARGETS)
  local Num5 = srcUser:GetRunePoint(31015_AESIR_DEALS_5_MORE_DAMAGE_TO_STUNNED_TARGETS)
  local RuneDamage1 = Num1 * 0.1 + Num2 * 0.05 + Num3 * 0.1 + Num4 * 0.05 + Num5 * 0.05
  local Num6 = srcUser:GetRunePoint(41011_AESIR_DEALS_15_DAMAGE_TO_SNARED_UNITS)
  local Num7 = srcUser:GetRunePoint(41012_AESIR_DEALS_10_DAMAGE_TO_SNARED_UNITS)
  local Num8 = srcUser:GetRunePoint(41013_AESIR_DEALS_15_DAMAGE_TO_SNARED_UNITS)
  local RuneDamage2 = Num6 * 0.15 + Num7 * 0.1 + Num8 * 0.15
  local Num9 = srcUser:GetRunePoint(62001_AESIR_DEALS_2_MORE_DAMAGE_TO_STUNNED_TARGETS)
  local Num10 = srcUser:GetRunePoint(62002_AESIR_DEALS_4_MORE_DAMAGE_TO_STUNNED_TARGETS)
  local Num11 = srcUser:GetRunePoint(62003_AESIR_DEALS_4_MORE_DAMAGE_TO_STUNNED_TARGETS)
  local Num12 = srcUser:GetRunePoint(62004_AESIR_DEALS_2_MORE_DAMAGE_TO_STUNNED_TARGETS)
  local Num13 = srcUser:GetRunePoint(62005_AESIR_DEALS_2_MORE_DAMAGE_TO_STUNNED_TARGETS)
  local RuneDamage3 = Num9 * 0.02 + Num10 * 0.04 + Num11 * 0.04 + Num12 * 0.02 + Num13 * 0.02
  local Num14 = srcUser:GetRunePoint(120180_AESIR_DEALS_3_DMG_TO_SILENCED_TARGETS)
  local RuneDamage4 = Num14 * 0.03
  local Num16 = srcUser:GetRunePoint(120210_AESIR_DEALS_10_DMG_TO_STUNNED_TARGETS)
  local RuneDamage6 = Num16 * 0.1
  local Num17 = srcUser:GetRunePoint(90210_AESIR_DEALS_5_DMG_TO_STUNNED_TARGETS)
  local RuneDamage7 = Num17 * 0.05
  local Num18 = srcUser:GetRunePoint(90200_AESIR_DAMAGE_TO_TARGETS_OF_SLOW_ATK_AND_CLOSE_CONFINE_3)
  local RuneDamage8 = Num18 * 0.03
  local Snatch = 0
  local fromid = targetUser:GetBuffFromID(106131_INTIMIDATE_AEISR_MONUMENT_DAMAGE_BONUS_:MAX_STACK_0)
  local guid = srcUser:GetGuid()
  local Num19 = srcUser:GetRunePoint(90110_AESIR_WITHIN_5_SECONDS_THE_DAMAGE_TO_TARGET_OF_INTIMIDATE_5)
  if fromid == guid then
    Snatch = 0.05 * Num19
  end
  local DizzyRatio = 0
  if srcUser:HasBuffID(80001480_ORC_HERO_CARD_DEPOSITE_:MAX_STACK_0) and srcUser:HasBuffID(51230_ORC_HERO_CARD_:MAX_STACK_0) or srcUser:HasBuffID(81002040_11121_:MAX_STACK_0) and srcUser:HasBuffID(56220_ORC_HERO_CARD_:MAX_STACK_0) then
    DizzyRatio = 0.15
  end
  if srcUser:HasBuffID(38010_3000812SR_HELMET_1_:MAX_STACK_0) then
    DizzyRatio = DizzyRatio + 0.1
  end
  local CardNumzsj = srcUser:GetEquipCardNum(7, 24624_ROTAR_ZAIRO_STAR_CARD)
  if srcUser:HasBuffID(54100_ROTAR_ZAIRO_CARD_:MAX_STACK_0) then
    DizzyRatio = DizzyRatio + 0.1 * CardNumzsj
  end
  local Ring5 = srcUser:GetEquipedID(5_ACCESSORY)
  local RefineLv5 = srcUser:GetEquipedRefineLv(5_ACCESSORY)
  local Ring6 = srcUser:GetEquipedID(6_ACCESSORY)
  local RefineLv6 = srcUser:GetEquipedRefineLv(6_ACCESSORY)
  local curse5 = 0
  local curse6 = 0
  if Ring5 == 44089 or Ring5 == 144089 then
    curse5 = RefineLv5 / 100
  end
  if Ring6 == 44089 or Ring6 == 144089 then
    curse6 = RefineLv6 / 100
  end
  local curse = curse5 + curse6
  local skilllv_Rogue = srcUser:GetLernedSkillLevel(484_RUNEMASTER:STATE_PURSUIT)
  local Rogue = 0
  if skilllv_Rogue <= 5 then
    Rogue = 0.015 * skilllv_Rogue
  elseif 5 < skilllv_Rogue then
    Rogue = 0.075 + (skilllv_Rogue - 5) * 0.005
  end
  local bloodrain = 0
  local RefineLv7 = srcUser:GetEquipedRefineLv(7_WEAPON)
  if srcUser:HasBuffID(90001048_BLOOD_TEARS_1_R9_:MAX_STACK_0) and 10 <= RefineLv7 then
    bloodrain = 0.15
  end
  if srcUser:HasBuffID(41870_ASSASSIN_S_JUR_:MAX_STACK_0) and 5 <= RefineLv7 then
    bloodrain = 0.2
  end
  if srcUser:HasBuffID(44290_POISONOUS_WHIP_ROSE_:MAX_STACK_0) or srcUser:HasBuffID(44300_NEPENTHES_LYRE_:MAX_STACK_0) then
    bloodrain = RefineLv7 * 0.01
  end
  if srcUser:HasBuffID(90004314_DESERT_STORM_1_T5_:MAX_STACK_0) then
    bloodrain = 0.15
  end
  if srcUser:HasBuffID(64350_2982_:MAX_STACK_0) then
    bloodrain = bloodrain + 0.1
  end
  local skilllv_Zhuangtai = srcUser:GetLernedSkillLevel(1166_THIEF:STATUS_VULNERABILITY)
  local skilllv_Zhuangtai2 = srcUser:GetLernedSkillLevel(1490_GUILLOTINE_CROSS:STATUS_VULNERABILITY)
  local skilllv_Zhuangtai3 = srcUser:GetLernedSkillLevel(1716_ARCHER:STATUS_VULNERABILITY)
  local skilllv_Zhuangtai4 = srcUser:GetLernedSkillLevel(1912_HUNTER:STATUS_VULNERABILITY)
  local Numfs = srcUser:GetRunePoint(24080_AESIR_STATUS_VULNERABILITY_S_EFFECT_3_AUTO_ATTACK_HAS_A_3_CHANCE_TO_INFLICT_BURN_FREEZING_STUN_OR_BLEEDING_ON_THE_ENEMY)
  local Yishang = skilllv_Zhuangtai * 0.05 + Numfs * 0.03 + skilllv_Zhuangtai2 * 0.05 + skilllv_Zhuangtai3 * 0.05 + skilllv_Zhuangtai4 * 0.05
  local FrozenM = 0
  local Card1 = srcUser:GetEquipCardNum(7, 20025_MARINA_CARD)
  if 0 < Card1 and srcUser:HasBuffID(80000250_MARINA_CARD_DEPOSITE_:MAX_STACK_0) then
    FrozenM = 0.25 + FrozenM
  end
  if srcUser:HasBuffID(52180_GARM_CARD_:MAX_STACK_0) and srcUser:HasBuffID(81000050_GARM_CARD_DEPOSITE_:MAX_STACK_0) then
    FrozenM = 0.2 + FrozenM
  end
  if srcUser:HasBuffID(56250_GARM_CARD_:MAX_STACK_0) and srcUser:HasBuffID(81003180_GARM_CARD_STORAGE_:MAX_STACK_0) then
    FrozenM = 0.2 + FrozenM
  end
  if srcUser:HasBuffID(54930_DEAD_STORMY_KNIGHT_CARD_:MAX_STACK_0) and srcUser:HasBuffID(54910_STORMY_KNIGHT_CARD_:MAX_STACK_0) then
    FrozenM = 0.1 + FrozenM
  end
  local BloodM = 0
  if srcUser:HasBuffID(37540_3000531SRSILVER_MOON_BLACKCAT_:MAX_STACK_0) then
    BloodM = 0.05 + BloodM
  end
  local Rosa = 0
  if srcUser:HasBuffID(138691) then
    local Bufflv = srcUser:GetBuffLevel(138691)
    Rosa = Bufflv * 0.03
  end
  if bits[CommonFun.StateEffect.Poison] == 1 and (Weapon == 40909_BLOOD_TEARS_1 or Weapon == 140909_BLOOD_TEARS_2) then
    return 1 + bloodrain
  end
  if bits[CommonFun.StateEffect.Poison] == 1 and (Weapon == 40945_ASSASSIN_S_JUR_1 or Weapon == 140945_ASSASSIN_S_JUR_2) then
    return 1 + bloodrain
  end
  if bits[CommonFun.StateEffect.Poison] == 1 and (Weapon == 62819_POISONOUS_WHIP_1 or Weapon == 162819_POISONOUS_WHIP_2 or Weapon == 63153_NEPENTHES_LYRE_1 or Weapon == 163153_NEPENTHES_LYRE_2) then
    return 1 + bloodrain
  end
  if bits[CommonFun.StateEffect.Poison] == 1 and (Weapon == 40766_DESERT_STORM_1 or Weapon == 140766_DESERT_STORM_2) then
    return 1 + bloodrain
  end
  if bits[CommonFun.StateEffect.Poison] == 1 then
    return 1 + bloodrain
  end
  if targetUser:GetBuffFromID(106131_INTIMIDATE_AEISR_MONUMENT_DAMAGE_BONUS_:MAX_STACK_0) and fromid == guid and (Profession == 92_ROGUE_ROGUE_ROGUE_ROGUE_ROGUE or Profession == 93_STALKER_STALKER_STALKER_STALKER_STALKER or Profession == 94_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER or Profession == 95_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER) then
    return 1 + Snatch
  end
  if bits[CommonFun.StateEffect.Dizzy] == 1 and (Profession == 92_ROGUE_ROGUE_ROGUE_ROGUE_ROGUE or Profession == 93_STALKER_STALKER_STALKER_STALKER_STALKER or Profession == 94_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER or Profession == 95_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER) then
    return 1 + Rogue + RuneDamage7 + Snatch
  end
  if (bits[CommonFun.StateEffect.NoMove] == 1 or targetUser:HasBuffID(106151_CLOSE_CONFINE_REMOVE_EFFECTS_:MAX_STACK_0)) and (Profession == 92_ROGUE_ROGUE_ROGUE_ROGUE_ROGUE or Profession == 93_STALKER_STALKER_STALKER_STALKER_STALKER or Profession == 94_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER or Profession == 95_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER) then
    return 1 + Rogue + RuneDamage8 + Snatch
  end
  if (bits[CommonFun.StateEffect.Dark] == 1 or targetUser:HasBuffID(106151_CLOSE_CONFINE_REMOVE_EFFECTS_:MAX_STACK_0)) and (Profession == 92_ROGUE_ROGUE_ROGUE_ROGUE_ROGUE or Profession == 93_STALKER_STALKER_STALKER_STALKER_STALKER or Profession == 94_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER or Profession == 95_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER) then
    return 1 + Rogue + Snatch + curse
  end
  if (bits[CommonFun.StateEffect.Dizzy] == 1 or bits[CommonFun.StateEffect.NoMove] == 1 or bits[CommonFun.StateEffect.Dark] == 1 or targetUser:HasBuffID(106151_CLOSE_CONFINE_REMOVE_EFFECTS_:MAX_STACK_0)) and (Profession == 92_ROGUE_ROGUE_ROGUE_ROGUE_ROGUE or Profession == 93_STALKER_STALKER_STALKER_STALKER_STALKER or Profession == 94_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER_SHADOW_CHASER or Profession == 95_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER_PHANTOM_DANCER) then
    return 1 + Rogue + Snatch
  end
  if bits[CommonFun.StateEffect.Dizzy] == 1 and (Weapon == 41813_WINDHAWK_1 or Weapon == 141813_WINDHAWK_2) then
    return 1.15 + RuneDamage1 + RuneDamage3 + RuneDamage6 + DizzyRatio + Rogue
  end
  if bits[CommonFun.StateEffect.Dizzy] == 1 and (Weapon == 41811_GUILLOTINE_1 or Weapon == 141811_GUILLOTINE_2) then
    return 1 + 0.05 * RefineLv + RuneDamage1 + RuneDamage3 + RuneDamage6 + DizzyRatio + Rogue
  end
  if bits[CommonFun.StateEffect.Dizzy] == 1 and (Profession == 61_MERCHANT or Profession == 62_BLACKSMITH or Profession == 63_WHITESMITH or Profession == 64_MECHANIC or Profession == 65_LIGHTBRINGER or Profession == 31_THIEF or Profession == 32_ASSASSIN or Profession == 33_ASSASSIN_CROSS or Profession == 34_GUILLOTINE_CROSS or Profession == 35_BLADE_SOUL or Profession == 213_LITTLE_SAVIOR or Profession == 214_RYUJINMARU or Profession == 215_RYUOUMARU) then
    return 1 + RuneDamage1 + RuneDamage3 + DizzyRatio
  end
  if bits[CommonFun.StateEffect.Freeze] == 1 then
    return 1 + Yishang + FrozenM
  end
  if bits[CommonFun.StateEffect.NoMove] == 1 then
    return 1 + RuneDamage2
  end
  if bits[CommonFun.StateEffect.Silence] == 1 and (Profession == 122_MONK_MONK or Profession == 123_CHAMPION_CHAMPION or Profession == 124_SHURA_SHURA or Profession == 125_DRAGON_FIST_DRAGON_FIST) then
    return 1 + RuneDamage4 + curse
  end
  if bits[CommonFun.StateEffect.Dizzy] == 1 and (Profession == 122_MONK_MONK or Profession == 123_CHAMPION_CHAMPION or Profession == 124_SHURA_SHURA or Profession == 125_DRAGON_FIST_DRAGON_FIST) then
    return 1 + RuneDamage6 + DizzyRatio
  end
  if srcUser:HasBuffID(80113_HEAD_CRUSH_PEAK_:MAX_STACK_0) and bits[CommonFun.StateEffect.Blood] == 1 then
    local skilllv_1 = srcUser:GetLernedSkillLevel(25_SWORDSMAN:HEAD_CRUSH)
    if 10 < skilllv_1 then
      return 1 + (skilllv_1 - 10) * 0.05 + BloodM + Rosa
    end
  end
  if bits[CommonFun.StateEffect.Blood] == 1 then
    return 1 + Yishang + BloodM + Rosa
  end
  if bits[CommonFun.StateEffect.Dizzy] == 1 and (Profession == 24_WARLOCK_WARLOCK or Profession == 25_ARCANE_MASTER_ARCANE_MASTER or Profession == 144_SUPER_NOVICE_SUPER_NOVICE or Profession == 145_NOVICE_GUARDIAN_NOVICE_GUARDIAN or Profession == 204_WARRIOR_OF_WILDFIRE_WARRIOR_OF_WILDFIRE or Profession == 205_INFERNO_ARMOR_INFERNO_ARMOR or Profession == 224_CHAOTIC_ARCHMAGE_CHAOTIC_ARCHMAGE or Profession == 225_SLAYER_SLAYER) then
    return 1 + Yishang + DizzyRatio
  end
  if (bits[CommonFun.StateEffect.Freeze] == 1 or bits[CommonFun.StateEffect.Blood] == 1 or bits[CommonFun.StateEffect.Burn] == 1) and (Profession == 24_WARLOCK_WARLOCK or Profession == 25_ARCANE_MASTER_ARCANE_MASTER or Profession == 144_SUPER_NOVICE_SUPER_NOVICE or Profession == 145_NOVICE_GUARDIAN_NOVICE_GUARDIAN or Profession == 204_WARRIOR_OF_WILDFIRE_WARRIOR_OF_WILDFIRE or Profession == 205_INFERNO_ARMOR_INFERNO_ARMOR or Profession == 224_CHAOTIC_ARCHMAGE_CHAOTIC_ARCHMAGE or Profession == 225_SLAYER_SLAYER) then
    return 1 + Yishang
  end
  if bits[CommonFun.StateEffect.Dizzy] == 1 then
    return 1 + DizzyRatio
  end
  local GemValue = srcUser:GetGemValue(91061_DMG_DEALT_TO_ENEMIES_IN_FEAR_PERCENTAGE)
  local RuneNum_mjhw = srcUser:GetRunePoint(153041_AESIR_MEOW_INFLICTS_EXTRA_DMG_OF_3_ON_ENEMY_UNITS_WITH_THE_FEAR_STATUS)
  if bits[CommonFun.StateEffect.Fear] == 1 then
    return 1 + GemValue / 100000 + RuneNum_mjhw * 0.03 + curse
  end
  if bits[CommonFun.StateEffect.Curse] == 1 then
    return 1 + curse + Rosa
  elseif bits[CommonFun.StateEffect.Fear] == 1 or bits[CommonFun.StateEffect.Dark] == 1 or bits[CommonFun.StateEffect.Silence] == 1 then
    return 1 + curse
  end
  return 1
end



*/