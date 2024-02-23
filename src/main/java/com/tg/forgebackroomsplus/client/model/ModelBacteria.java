package com.tg.forgebackroomsplus.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBacteria<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("forge_backrooms_plus", "model_bacteria"), "main");
	public final ModelPart torso;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart head;

	public ModelBacteria(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(23, 4).addBox(-2.0F, -16.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = torso.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 15).addBox(-5.3738F, 0.5757F, -2.8498F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -23.0F, -1.0F, -1.8173F, 0.1779F, 1.289F));
		PartDefinition cube_r2 = torso.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 8).addBox(-6.5359F, 0.5F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.0F, 0.0F, -1.8285F, -0.1582F, 1.735F));
		PartDefinition cube_r3 = torso.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 0).addBox(-6.3738F, -0.4243F, -0.8498F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -23.0F, -1.0F, -0.0624F, 0.2509F, 1.7906F));
		PartDefinition cube_r4 = torso.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 18).addBox(-6.5359F, -0.5F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -17.0F, 0.0F, -0.1011F, -0.1399F, 1.3908F));
		PartDefinition cube_r5 = torso.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 20).addBox(-4.5359F, -0.5F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -17.0F, 0.0F, -0.4737F, -0.0803F, -0.1551F));
		PartDefinition cube_r6 = torso.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(23, 2).addBox(-5.0F, 0.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -17.0F, 0.0F, -0.4235F, 0.233F, 0.4733F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(21, 12).addBox(-1.0F, 15.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 8.0F, -0.5F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r7 = left_leg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 22).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 8.0F, 0.0F, -3.1333F, 0.4316F, 3.1361F));
		PartDefinition cube_r8 = left_leg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 24).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 8.0F, 0.0F, -2.9931F, 0.1355F, -3.0096F));
		PartDefinition cube_r9 = left_leg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 24).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 8.0F, 0.0F, 3.1155F, 0.1355F, -3.0096F));
		PartDefinition cube_r10 = left_leg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(28, 31).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 8.0F, 0.0F, 0.0112F, 0.0028F, 0.1795F));
		PartDefinition cube_r11 = left_leg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 6).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 8.0F, 0.0F, -0.0843F, 0.2971F, -0.1368F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(15, 18).addBox(-2.0F, 15.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 8.0F, -0.5F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r12 = right_leg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 8.0F, 0.0F, -3.1333F, 0.4316F, 3.1361F));
		PartDefinition cube_r13 = right_leg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 8.0F, 0.0F, -2.9931F, 0.1355F, -3.0096F));
		PartDefinition cube_r14 = right_leg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(8, 23).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 8.0F, 0.0F, 3.1155F, 0.1355F, -3.0096F));
		PartDefinition cube_r15 = right_leg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(12, 23).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 8.0F, 0.0F, 0.0112F, 0.0028F, 0.1795F));
		PartDefinition cube_r16 = right_leg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(16, 24).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 8.0F, 0.0F, -0.0843F, 0.2971F, -0.1368F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -0.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r17 = left_arm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 10).addBox(-0.5604F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.5F, 21.0F, 0.5F, 3.0872F, -0.6361F, -2.3041F));
		PartDefinition cube_r18 = left_arm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(28, 13).addBox(-0.5604F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.5F, 21.0F, 0.5F, 0.5965F, -0.1373F, -1.0122F));
		PartDefinition cube_r19 = left_arm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(8, 32).addBox(-0.5604F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.5F, 21.0F, 0.5F, -0.48F, 0.0F, -0.48F));
		PartDefinition cube_r20 = left_arm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(4, 15).addBox(0.0F, 0.0F, 0.0F, 1.0F, 24.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.48F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -5.0F, -0.5F, 0.0F, 0.0F, 1.309F));
		PartDefinition cube_r21 = right_arm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(16, 2).addBox(-0.5604F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.5F, 21.0F, 0.5F, 3.0872F, -0.6361F, -2.3041F));
		PartDefinition cube_r22 = right_arm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(8, 17).addBox(-0.5604F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.5F, 21.0F, 0.5F, 0.5965F, -0.1373F, -1.0122F));
		PartDefinition cube_r23 = right_arm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 17).addBox(-0.5604F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.5F, 21.0F, 0.5F, -0.48F, 0.0F, -0.48F));
		PartDefinition cube_r24 = right_arm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, 0.0F, 0.0F, 1.0F, 24.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.48F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 2).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 2.8242F, -1.2635F, -2.3682F));
		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(8, 17).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 2.9061F, 0.3829F, 3.0522F));
		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.0F, -1.0F, 3.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.2817F, 0.6784F, 0.1797F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
