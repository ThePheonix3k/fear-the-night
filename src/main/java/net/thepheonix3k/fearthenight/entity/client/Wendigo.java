// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.thepheonix3k.fearthenight.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.thepheonix3k.fearthenight.entity.custom.WendigoEntity;

public class Wendigo<T extends WendigoEntity> extends SinglePartEntityModel<T> {
	private final ModelPart full;
	private final ModelPart head;

    public Wendigo(ModelPart full) {
        this.full = full;
		this.head = full.getChild("body")
    }

    public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData full = modelPartData.addChild("full", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = full.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -23.9104F, 2.6876F));

		ModelPartData cube_r1 = body.addChild("cube_r1", ModelPartBuilder.create().uv(0, 95).cuboid(-3.8F, -2.9F, -2.8F, 7.6F, 7.8F, 6.6F, new Dilation(0.25F)), ModelTransform.of(0.0F, -7.6113F, -1.2221F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r2 = body.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-8.8F, 0.0F, -5.8F, 17.6F, 0.0F, 15.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.5555F, -6.7034F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r3 = body.addChild("cube_r3", ModelPartBuilder.create().uv(0, 35).cuboid(-5.8F, -6.2F, 1.8F, 11.6F, 6.8F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.7289F, 3.4796F, 1.3963F, 0.0F, 0.0F));

		ModelPartData cube_r4 = body.addChild("cube_r4", ModelPartBuilder.create().uv(0, 0).cuboid(-8.8F, 0.0F, -7.8F, 17.6F, 0.0F, 15.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, -16.5555F, -6.7034F, 0.8727F, 0.0F, 0.0F));

		ModelPartData cube_r5 = body.addChild("cube_r5", ModelPartBuilder.create().uv(0, 0).cuboid(-5.8F, -6.9F, 0.9F, 11.6F, 6.8F, 0.1F, new Dilation(0.0F)), ModelTransform.of(0.0F, -15.0494F, 4.1347F, 0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r6 = body.addChild("cube_r6", ModelPartBuilder.create().uv(41, 85).cuboid(-5.8F, -7.4F, 0.25F, 11.6F, 9.8F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -11.7109F, 3.7256F, 0.6109F, 0.0F, 0.0F));

		ModelPartData cube_r7 = body.addChild("cube_r7", ModelPartBuilder.create().uv(26, 25).cuboid(-4.8F, -3.4F, -5.25F, 9.6F, 6.8F, 10.5F, new Dilation(0.25F)), ModelTransform.of(0.0F, -13.493F, -2.4245F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r8 = body.addChild("cube_r8", ModelPartBuilder.create().uv(32, 50).cuboid(-1.8F, -4.9F, -5.2F, 3.6F, 9.8F, 10.0F, new Dilation(0.25F)), ModelTransform.of(4.3295F, -12.1729F, -2.473F, 0.3806F, -0.0992F, 0.2427F));

		ModelPartData cube_r9 = body.addChild("cube_r9", ModelPartBuilder.create().uv(58, 55).cuboid(-1.8F, -4.9F, -5.2F, 3.6F, 9.8F, 10.0F, new Dilation(0.25F)), ModelTransform.of(-4.3295F, -12.1729F, -2.473F, 0.3806F, 0.0992F, -0.2427F));

		ModelPartData cube_r10 = body.addChild("cube_r10", ModelPartBuilder.create().uv(48, 41).cuboid(-3.8F, -0.9F, -4.8F, 7.6F, 5.8F, 9.6F, new Dilation(0.25F)), ModelTransform.of(0.0F, -17.1392F, -6.5662F, 0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r11 = body.addChild("cube_r11", ModelPartBuilder.create().uv(80, 13).cuboid(-2.8F, -0.4F, -2.5F, 5.6F, 8.8F, 5.3F, new Dilation(0.5F)), ModelTransform.of(0.0F, -1.5963F, -0.3446F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r12 = body.addChild("cube_r12", ModelPartBuilder.create().uv(0, 64).cuboid(-1.8F, -4.9F, -5.2F, 3.6F, 9.8F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-4.3295F, -12.1729F, -2.473F, 0.3806F, 0.0992F, -0.2427F));

		ModelPartData cube_r13 = body.addChild("cube_r13", ModelPartBuilder.create().uv(64, 21).cuboid(-1.8F, -4.9F, -5.2F, 3.6F, 9.8F, 10.0F, new Dilation(0.0F)), ModelTransform.of(4.3295F, -12.1729F, -2.473F, 0.3806F, -0.0992F, 0.2427F));

		ModelPartData cube_r14 = body.addChild("cube_r14", ModelPartBuilder.create().uv(0, 50).cuboid(-3.8F, -0.9F, -4.8F, 7.6F, 5.8F, 9.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, -17.1392F, -6.5662F, 0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r15 = body.addChild("cube_r15", ModelPartBuilder.create().uv(67, 0).cuboid(-3.8F, -2.9F, -2.8F, 7.6F, 7.8F, 6.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.6113F, -1.2221F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r16 = body.addChild("cube_r16", ModelPartBuilder.create().uv(39, 5).cuboid(-4.8F, -6.9F, -3.7F, 9.6F, 6.8F, 10.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.6663F, -2.5172F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r17 = body.addChild("cube_r17", ModelPartBuilder.create().uv(21, 80).cuboid(-2.8F, -3.4F, -2.5F, 5.6F, 8.8F, 5.3F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5963F, -0.3446F, -0.2618F, 0.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -15.015F, -7.8792F));

		ModelPartData cube_r18 = head.addChild("cube_r18", ModelPartBuilder.create().uv(0, 22).cuboid(-1.9F, -7.6F, -0.2F, 3.8F, 5.0F, 2.0F, new Dilation(0.25F))
		.uv(0, 29).cuboid(-1.7F, -7.4F, -2.2F, 3.4F, 4.8F, 2.0F, new Dilation(0.24F))
		.uv(39, 113).cuboid(-1.9F, -7.6F, -0.2F, 3.8F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.8153F, -1.1603F, 1.6581F, 0.0F, 0.0F));

		ModelPartData cube_r19 = head.addChild("cube_r19", ModelPartBuilder.create().uv(0, 15).cuboid(-0.4488F, 3.0459F, -4.8F, 13.6F, 0.0F, 10.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, -13.7936F, 1.8929F, 0.8576F, 0.3751F, -0.3069F));

		ModelPartData cube_r20 = head.addChild("cube_r20", ModelPartBuilder.create().uv(0, 25).cuboid(-13.1512F, 3.0459F, -4.8F, 13.6F, 0.0F, 10.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, -13.7936F, 1.8929F, 0.8576F, -0.3751F, 0.3069F));

		ModelPartData cube_r21 = head.addChild("cube_r21", ModelPartBuilder.create().uv(0, 41).cuboid(-12.1512F, 3.0459F, -4.8F, 12.6F, 0.0F, 9.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.6421F, -2.0669F, 1.2774F, -0.4623F, 0.1339F));

		ModelPartData cube_r22 = head.addChild("cube_r22", ModelPartBuilder.create().uv(24, 41).cuboid(-0.4488F, 3.0459F, -4.8F, 12.6F, 0.0F, 9.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.6421F, -2.0669F, 1.2774F, 0.4623F, -0.1339F));

		ModelPartData cube_r23 = head.addChild("cube_r23", ModelPartBuilder.create().uv(74, 48).cuboid(-2.8F, -2.4F, -2.8F, 5.6F, 6.8F, 7.0F, new Dilation(0.25F))
		.uv(66, 74).cuboid(-2.8F, -2.4F, -2.8F, 5.6F, 6.8F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.7979F, -1.3595F, 1.6581F, 0.0F, 0.0F));

		ModelPartData cube_r24 = head.addChild("cube_r24", ModelPartBuilder.create().uv(49, 106).cuboid(-1.8F, -0.9F, -3.3F, 3.6F, 5.8F, 4.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.6018F, -0.5216F, 0.5236F, 0.0F, 0.0F));

		ModelPartData jaw = head.addChild("jaw", ModelPartBuilder.create(), ModelTransform.of(0.0F, -3.495F, -2.2318F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r25 = jaw.addChild("cube_r25", ModelPartBuilder.create().uv(68, 21).mirrored().cuboid(-2.3F, -5.3676F, -0.9173F, 4.6F, 6.4F, 1.6F, new Dilation(0.25F)).mirrored(false)
		.uv(73, 112).cuboid(-2.3F, -5.3676F, 0.2827F, 4.6F, 5.4F, 2.0F, new Dilation(-0.001F))
		.uv(0, 64).cuboid(-2.3F, -5.3676F, -0.9173F, 4.6F, 6.4F, 1.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.3302F, -0.7368F, 2.0071F, 0.0F, 0.0F));

		ModelPartData left_arm = body.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.7955F, -11.6318F, -2.6094F));

		ModelPartData cube_r26 = left_arm.addChild("cube_r26", ModelPartBuilder.create().uv(0, 64).cuboid(0.0F, -5.9F, -5.3F, 0.0F, 11.8F, 10.6F, new Dilation(0.0F)), ModelTransform.of(3.0F, 1.0F, 0.0F, 0.4293F, 0.279F, 0.1932F));

		ModelPartData cube_r27 = left_arm.addChild("cube_r27", ModelPartBuilder.create().uv(93, 0).cuboid(-0.0653F, -3.5605F, -3.1827F, 5.6F, 5.8F, 5.6F, new Dilation(0.5F))
		.uv(91, 46).cuboid(5.5347F, -2.5605F, -2.1827F, 7.6F, 3.8F, 4.6F, new Dilation(0.25F)), ModelTransform.of(-0.5423F, -0.7836F, 0.4502F, 0.504F, 0.0596F, 0.6273F));

		ModelPartData cube_r28 = left_arm.addChild("cube_r28", ModelPartBuilder.create().uv(105, 84).cuboid(5.5347F, -2.5605F, -2.1827F, 7.6F, 3.8F, 3.6F, new Dilation(0.0F))
		.uv(55, 96).cuboid(-0.0653F, -3.5605F, -3.1827F, 5.6F, 5.8F, 5.6F, new Dilation(0.0F)), ModelTransform.of(-0.5423F, -0.7836F, 0.4502F, 0.504F, 0.0596F, 0.6273F));

		ModelPartData left_arm_down = left_arm.addChild("left_arm_down", ModelPartBuilder.create(), ModelTransform.pivot(10.1617F, 6.3477F, -0.6784F));

		ModelPartData cube_r29 = left_arm_down.addChild("cube_r29", ModelPartBuilder.create().uv(54, 21).cuboid(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 7.0F, new Dilation(0.25F)), ModelTransform.of(4.6846F, 4.7172F, -2.6254F, 0.9853F, -0.954F, -0.2939F));

		ModelPartData cube_r30 = left_arm_down.addChild("cube_r30", ModelPartBuilder.create().uv(100, 10).cuboid(-3.0F, -2.0F, -1.5F, 4.0F, 4.0F, 5.0F, new Dilation(0.25F)), ModelTransform.of(1.874F, 1.2139F, -0.2115F, 0.9853F, -0.954F, -0.2939F));

		ModelPartData cube_r31 = left_arm_down.addChild("cube_r31", ModelPartBuilder.create().uv(78, 93).cuboid(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(4.6846F, 4.7172F, -2.6254F, 0.9853F, -0.954F, -0.2939F));

		ModelPartData cube_r32 = left_arm_down.addChild("cube_r32", ModelPartBuilder.create().uv(31, 104).cuboid(-3.0F, -1.9F, -1.5F, 4.0F, 4.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(1.874F, 1.2139F, -0.2115F, 0.9853F, -0.954F, -0.2939F));

		ModelPartData left_finger1 = left_arm_down.addChild("left_finger1", ModelPartBuilder.create(), ModelTransform.pivot(7.1396F, 6.1272F, -5.2056F));

		ModelPartData cube_r33 = left_finger1.addChild("cube_r33", ModelPartBuilder.create().uv(71, 33).cuboid(-1.2815F, -0.539F, -6.5072F, 0.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(1.4F, 0.2F, 0.5F, 1.1814F, -0.8998F, 0.0596F));

		ModelPartData left_finger3 = left_arm_down.addChild("left_finger3", ModelPartBuilder.create(), ModelTransform.pivot(8.4215F, 6.0781F, -3.2279F));

		ModelPartData cube_r34 = left_finger3.addChild("cube_r34", ModelPartBuilder.create().uv(16, 57).cuboid(1.2185F, -0.539F, -6.5072F, 0.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.1181F, 0.2491F, -1.4778F, 1.7118F, -0.9509F, -0.5957F));

		ModelPartData left_finger2 = left_arm_down.addChild("left_finger2", ModelPartBuilder.create(), ModelTransform.pivot(7.9628F, 6.0356F, -4.5964F));

		ModelPartData cube_r35 = left_finger2.addChild("cube_r35", ModelPartBuilder.create().uv(48, 48).cuboid(-0.1815F, -0.539F, -6.5072F, 0.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.5768F, 0.2916F, -0.1092F, 1.4653F, -0.954F, -0.2939F));

		ModelPartData big_finger_left = left_arm_down.addChild("big_finger_left", ModelPartBuilder.create(), ModelTransform.pivot(3.7821F, 4.9626F, -2.7775F));

		ModelPartData cube_r36 = big_finger_left.addChild("cube_r36", ModelPartBuilder.create().uv(23, 42).cuboid(1.7722F, 0.1797F, -8.0944F, 0.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 0.0F, 0.7922F, 1.0258F, -0.6008F));

		ModelPartData right_arm = body.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-6.0556F, -11.5394F, -2.6094F));

		ModelPartData cube_r37 = right_arm.addChild("cube_r37", ModelPartBuilder.create().uv(0, 59).cuboid(-3.9347F, -6.5605F, -5.1827F, 0.0F, 11.8F, 10.6F, new Dilation(0.0F))
		.uv(91, 93).cuboid(-13.1347F, -2.5605F, -2.1827F, 7.6F, 3.8F, 4.6F, new Dilation(0.25F))
		.uv(44, 118).cuboid(-5.5347F, -3.5605F, -3.1827F, 5.6F, 5.8F, 5.6F, new Dilation(0.5F)), ModelTransform.of(0.8023F, -0.876F, 0.4502F, 0.504F, -0.0596F, -0.6273F));

		ModelPartData cube_r38 = right_arm.addChild("cube_r38", ModelPartBuilder.create().uv(35, 94).cuboid(-5.5347F, -3.5605F, -3.1827F, 5.6F, 5.8F, 5.6F, new Dilation(0.0F))
		.uv(104, 53).cuboid(-13.1347F, -2.5605F, -2.1827F, 7.6F, 3.8F, 3.6F, new Dilation(0.0F)), ModelTransform.of(0.8023F, -0.876F, 0.4502F, 0.504F, -0.0596F, -0.6273F));

		ModelPartData right_arm_down = right_arm.addChild("right_arm_down", ModelPartBuilder.create(), ModelTransform.pivot(-9.9017F, 6.2552F, -1.6784F));

		ModelPartData cube_r39 = right_arm_down.addChild("cube_r39", ModelPartBuilder.create().uv(0, 119).cuboid(-1.0F, -2.0F, -1.5F, 4.0F, 4.0F, 5.0F, new Dilation(0.25F)), ModelTransform.of(-1.874F, 1.2139F, 0.7885F, 0.9853F, 0.954F, 0.2939F));

		ModelPartData cube_r40 = right_arm_down.addChild("cube_r40", ModelPartBuilder.create().uv(91, 54).cuboid(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 7.0F, new Dilation(0.25F)), ModelTransform.of(-4.6846F, 4.7172F, -1.6254F, 0.9853F, 0.954F, 0.2939F));

		ModelPartData cube_r41 = right_arm_down.addChild("cube_r41", ModelPartBuilder.create().uv(93, 19).cuboid(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-4.6846F, 4.7172F, -1.6254F, 0.9853F, 0.954F, 0.2939F));

		ModelPartData cube_r42 = right_arm_down.addChild("cube_r42", ModelPartBuilder.create().uv(70, 103).cuboid(-1.0F, -1.9F, -1.5F, 4.0F, 4.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-1.874F, 1.2139F, 0.7885F, 0.9853F, 0.954F, 0.2939F));

		ModelPartData big_finger_right = right_arm_down.addChild("big_finger_right", ModelPartBuilder.create(), ModelTransform.pivot(-4.1194F, 5.7501F, -2.9792F));

		ModelPartData cube_r43 = big_finger_right.addChild("cube_r43", ModelPartBuilder.create().uv(36, 13).cuboid(-1.7722F, 0.1797F, -8.0944F, 0.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(2.3374F, -0.7875F, 1.2016F, 0.7922F, -1.0258F, 0.6008F));

		ModelPartData right_finger2 = right_arm_down.addChild("right_finger2", ModelPartBuilder.create(), ModelTransform.pivot(-7.5396F, 6.3272F, -3.7056F));

		ModelPartData cube_r44 = right_finger2.addChild("cube_r44", ModelPartBuilder.create().uv(23, 47).cuboid(0.1815F, -0.539F, -6.5072F, 0.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 0.0F, 0.0F, 1.4653F, 0.954F, 0.2939F));

		ModelPartData right_finger3 = right_arm_down.addChild("right_finger3", ModelPartBuilder.create(), ModelTransform.pivot(-8.5396F, 6.3272F, -3.7056F));

		ModelPartData cube_r45 = right_finger3.addChild("cube_r45", ModelPartBuilder.create().uv(0, 4).cuboid(-1.2185F, -0.539F, -6.5072F, 0.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.7118F, 0.9509F, 0.5957F));

		ModelPartData right_finger1 = right_arm_down.addChild("right_finger1", ModelPartBuilder.create(), ModelTransform.pivot(-7.0812F, 6.6007F, -3.7787F));

		ModelPartData cube_r46 = right_finger1.addChild("cube_r46", ModelPartBuilder.create().uv(0, 0).cuboid(1.2815F, -0.539F, -6.5072F, 0.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-1.4584F, -0.2735F, 0.073F, 1.1814F, 0.8998F, -0.0596F));

		ModelPartData right_leg = full.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-3.275F, -21.6134F, 2.3237F));

		ModelPartData cube_r47 = right_leg.addChild("cube_r47", ModelPartBuilder.create().uv(0, 83).cuboid(-7.85F, -7.5F, -1.6F, 5.0F, 7.8F, 5.6F, new Dilation(0.25F)), ModelTransform.of(3.325F, 2.2652F, -3.9622F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r48 = right_leg.addChild("cube_r48", ModelPartBuilder.create().uv(85, 110).cuboid(-7.35F, -1.5F, -0.6F, 4.1F, 4.8F, 3.6F, new Dilation(0.5F)), ModelTransform.of(3.325F, 2.1237F, -3.8208F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r49 = right_leg.addChild("cube_r49", ModelPartBuilder.create().uv(85, 35).cuboid(-7.85F, -7.5F, -1.6F, 5.0F, 6.8F, 5.6F, new Dilation(0.0F)), ModelTransform.of(3.325F, 2.2652F, -3.9622F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r50 = right_leg.addChild("cube_r50", ModelPartBuilder.create().uv(110, 97).cuboid(-7.35F, -1.5F, -0.6F, 4.1F, 4.8F, 3.6F, new Dilation(0.0F)), ModelTransform.of(3.325F, 2.1237F, -3.8208F, -0.7854F, 0.0F, 0.0F));

		ModelPartData right_leg_down = right_leg.addChild("right_leg_down", ModelPartBuilder.create(), ModelTransform.pivot(-2.155F, 5.5752F, -4.7225F));

		ModelPartData cube_r51 = right_leg_down.addChild("cube_r51", ModelPartBuilder.create().uv(109, 44).cuboid(-7.35F, -1.9F, -1.8F, 4.1F, 3.8F, 3.6F, new Dilation(0.25F)), ModelTransform.of(5.48F, -0.0648F, -0.0681F, 0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r52 = right_leg_down.addChild("cube_r52", ModelPartBuilder.create().uv(99, 113).cuboid(-7.35F, -1.9F, -1.8F, 4.1F, 3.8F, 3.6F, new Dilation(-0.001F)), ModelTransform.of(5.48F, -0.0648F, -0.0681F, 0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r53 = right_leg_down.addChild("cube_r53", ModelPartBuilder.create().uv(103, 104).cuboid(-12.6F, -0.9874F, -0.3395F, 3.6F, 3.8F, 6.6F, new Dilation(-0.01F)), ModelTransform.of(10.93F, 4.5014F, 3.7622F, 2.4435F, 0.0F, 0.0F));

		ModelPartData right_foot = right_leg_down.addChild("right_foot", ModelPartBuilder.create().uv(59, 111).cuboid(-1.5F, 8.2371F, -5.1563F, 3.0F, 3.0F, 4.0F, new Dilation(0.0F))
		.uv(109, 60).cuboid(-1.5F, 8.2371F, -5.1563F, 3.0F, 3.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(-0.07F, 4.8011F, 5.5551F));

		ModelPartData cube_r54 = right_foot.addChild("cube_r54", ModelPartBuilder.create().uv(0, 46).cuboid(-1.3F, -0.2977F, -9.7681F, 2.6F, 3.3F, 2.6F, new Dilation(0.25F)), ModelTransform.of(0.0F, -0.2258F, 0.2143F, 1.1345F, 0.0F, 0.0F));

		ModelPartData cube_r55 = right_foot.addChild("cube_r55", ModelPartBuilder.create().uv(98, 64).cuboid(-1.0F, -1.4252F, -7.8988F, 2.0F, 3.0F, 7.6F, new Dilation(0.25F))
		.uv(100, 74).cuboid(-1.0F, -1.4252F, -7.8988F, 2.0F, 3.0F, 7.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.2258F, 0.2143F, 1.309F, 0.0F, 0.0F));

		ModelPartData cube_r56 = right_foot.addChild("cube_r56", ModelPartBuilder.create().uv(106, 19).cuboid(-2.0F, -2.6176F, -1.673F, 4.0F, 4.0F, 3.6F, new Dilation(0.25F))
		.uv(112, 26).cuboid(-2.0F, -2.6176F, -1.673F, 4.0F, 4.0F, 3.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.2258F, 0.2143F, 1.8326F, 0.0F, 0.0F));

		ModelPartData left_leg = full.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(3.525F, -21.6134F, 2.3237F));

		ModelPartData cube_r57 = left_leg.addChild("cube_r57", ModelPartBuilder.create().uv(109, 90).cuboid(3.25F, -1.5F, -0.6F, 4.1F, 4.8F, 3.6F, new Dilation(0.5F)), ModelTransform.of(-3.475F, 2.1237F, -3.8208F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r58 = left_leg.addChild("cube_r58", ModelPartBuilder.create().uv(83, 69).cuboid(2.75F, -7.5F, -1.6F, 5.0F, 7.8F, 5.6F, new Dilation(0.25F)), ModelTransform.of(-3.475F, 2.2652F, -3.9622F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r59 = left_leg.addChild("cube_r59", ModelPartBuilder.create().uv(85, 82).cuboid(2.75F, -7.5F, -1.6F, 5.0F, 6.8F, 5.6F, new Dilation(0.0F)), ModelTransform.of(-3.475F, 2.2652F, -3.9622F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r60 = left_leg.addChild("cube_r60", ModelPartBuilder.create().uv(111, 74).cuboid(3.25F, -1.5F, -0.6F, 4.1F, 4.8F, 3.6F, new Dilation(0.0F)), ModelTransform.of(-3.475F, 2.1237F, -3.8208F, -0.7854F, 0.0F, 0.0F));

		ModelPartData left_leg_down = left_leg.addChild("left_leg_down", ModelPartBuilder.create(), ModelTransform.pivot(1.875F, 5.8119F, -4.1866F));

		ModelPartData cube_r61 = left_leg_down.addChild("cube_r61", ModelPartBuilder.create().uv(113, 7).cuboid(-2.1F, -2.3018F, -2.3425F, 4.1F, 3.8F, 3.6F, new Dilation(0.25F))
		.uv(25, 113).cuboid(-2.1F, -2.3018F, -2.3425F, 4.1F, 3.8F, 3.6F, new Dilation(-0.001F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r62 = left_leg_down.addChild("cube_r62", ModelPartBuilder.create().uv(105, 35).cuboid(-1.9F, -2.1806F, -5.5523F, 3.6F, 3.8F, 6.6F, new Dilation(-0.01F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 2.4435F, 0.0F, 0.0F));

		ModelPartData left_foot = left_leg_down.addChild("left_foot", ModelPartBuilder.create().uv(113, 0).cuboid(-1.5F, 8.291F, -4.6091F, 3.0F, 3.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 108).cuboid(-1.5F, 8.291F, -4.6091F, 3.0F, 3.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.1F, 4.5105F, 4.472F));

		ModelPartData cube_r63 = left_foot.addChild("cube_r63", ModelPartBuilder.create().uv(78, 118).cuboid(-0.9F, 4.7529F, -10.735F, 2.0F, 3.0F, 7.6F, new Dilation(0.25F))
		.uv(91, 100).cuboid(-0.9F, 4.7529F, -10.735F, 2.0F, 3.0F, 7.6F, new Dilation(0.0F)), ModelTransform.of(-0.1F, -4.5105F, -4.472F, 1.309F, 0.0F, 0.0F));

		ModelPartData cube_r64 = left_foot.addChild("cube_r64", ModelPartBuilder.create().uv(0, 41).cuboid(-1.2F, 6.279F, -11.4885F, 2.6F, 3.3F, 2.6F, new Dilation(0.25F)), ModelTransform.of(-0.1F, -4.5105F, -4.472F, 1.1345F, 0.0F, 0.0F));

		ModelPartData cube_r65 = left_foot.addChild("cube_r65", ModelPartBuilder.create().uv(0, 0).cuboid(-1.9F, 1.3146F, -7.2183F, 4.0F, 4.0F, 3.6F, new Dilation(0.25F))
		.uv(11, 112).cuboid(-1.9F, 1.3146F, -7.2183F, 4.0F, 4.0F, 3.6F, new Dilation(0.0F)), ModelTransform.of(-0.1F, -4.5105F, -4.472F, 1.8326F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(WendigoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		full.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return full;
	}
}