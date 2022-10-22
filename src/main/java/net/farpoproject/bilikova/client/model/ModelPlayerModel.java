package net.farpoproject.bilikova.client.model;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.util.Mth;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;

import java.util.Random;
import java.util.List;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

import com.google.common.collect.Iterables;
import com.google.common.collect.ImmutableList;

@OnlyIn(Dist.CLIENT)
public class ModelPlayerModel<T extends LivingEntity> extends HumanoidModel<T> {
	private static final String EAR = "ear";
	private static final String CLOAK = "cloak";
	private static final String LEFT_SLEEVE = "left_sleeve";
	private static final String RIGHT_SLEEVE = "right_sleeve";
	private static final String LEFT_PANTS = "left_pants";
	private static final String RIGHT_PANTS = "right_pants";
	private final List<ModelPart> parts;
	public final ModelPart leftSleeve;
	public final ModelPart rightSleeve;
	public final ModelPart leftPants;
	public final ModelPart rightPants;
	public final ModelPart jacket;
	public final ModelPart cloak;
	public final ModelPart ear;
	private final boolean slim;

	public ModelPlayerModel(ModelPart p_170821_, boolean p_170822_) {
		super(p_170821_, RenderType::entityTranslucent);
		this.slim = p_170822_;
		this.ear = p_170821_.getChild("ear");
		this.cloak = p_170821_.getChild("cloak");
		this.leftSleeve = p_170821_.getChild("left_sleeve");
		this.rightSleeve = p_170821_.getChild("right_sleeve");
		this.leftPants = p_170821_.getChild("left_pants");
		this.rightPants = p_170821_.getChild("right_pants");
		this.jacket = p_170821_.getChild("jacket");
		this.parts = p_170821_.getAllParts().filter((p_170824_) -> {
			return !p_170824_.isEmpty();
		}).collect(ImmutableList.toImmutableList());
	}

	public static MeshDefinition createMesh(CubeDeformation p_170826_, boolean p_170827_) {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(p_170826_, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		partdefinition.addOrReplaceChild("ear", CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, p_170826_),
				PartPose.ZERO);
		partdefinition.addOrReplaceChild("cloak",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, p_170826_, 1.0F, 0.5F),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		float f = 0.25F;
		if (p_170827_) {
			partdefinition.addOrReplaceChild("left_arm",
					CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, p_170826_),
					PartPose.offset(5.0F, 2.5F, 0.0F));
			partdefinition.addOrReplaceChild("right_arm",
					CubeListBuilder.create().texOffs(40, 16).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, p_170826_),
					PartPose.offset(-5.0F, 2.5F, 0.0F));
			partdefinition.addOrReplaceChild("left_sleeve",
					CubeListBuilder.create().texOffs(48, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, p_170826_.extend(0.25F)),
					PartPose.offset(5.0F, 2.5F, 0.0F));
			partdefinition.addOrReplaceChild("right_sleeve",
					CubeListBuilder.create().texOffs(40, 32).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, p_170826_.extend(0.25F)),
					PartPose.offset(-5.0F, 2.5F, 0.0F));
		} else {
			partdefinition.addOrReplaceChild("left_arm",
					CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_),
					PartPose.offset(5.0F, 2.0F, 0.0F));
			partdefinition.addOrReplaceChild("left_sleeve",
					CubeListBuilder.create().texOffs(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_.extend(0.25F)),
					PartPose.offset(5.0F, 2.0F, 0.0F));
			partdefinition.addOrReplaceChild("right_sleeve",
					CubeListBuilder.create().texOffs(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_.extend(0.25F)),
					PartPose.offset(-5.0F, 2.0F, 0.0F));
		}
		partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_pants",
				CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_.extend(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_pants",
				CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_170826_.extend(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		partdefinition.addOrReplaceChild("jacket",
				CubeListBuilder.create().texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, p_170826_.extend(0.25F)), PartPose.ZERO);
		return meshdefinition;
	}

	protected Iterable<ModelPart> bodyParts() {
		return Iterables.concat(super.bodyParts(), ImmutableList.of(this.leftPants, this.rightPants, this.leftSleeve, this.rightSleeve, this.jacket));
	}

	public void renderEars(PoseStack p_103402_, VertexConsumer p_103403_, int p_103404_, int p_103405_) {
		this.ear.copyFrom(this.head);
		this.ear.x = 0.0F;
		this.ear.y = 0.0F;
		this.ear.render(p_103402_, p_103403_, p_103404_, p_103405_);
	}

	public void renderCloak(PoseStack p_103412_, VertexConsumer p_103413_, int p_103414_, int p_103415_) {
		this.cloak.render(p_103412_, p_103413_, p_103414_, p_103415_);
	}

	public void setAllVisible(boolean p_103419_) {
		super.setAllVisible(p_103419_);
		this.leftSleeve.visible = p_103419_;
		this.rightSleeve.visible = p_103419_;
		this.leftPants.visible = p_103419_;
		this.rightPants.visible = p_103419_;
		this.jacket.visible = p_103419_;
		this.cloak.visible = p_103419_;
		this.ear.visible = p_103419_;
	}

	public void translateToHand(HumanoidArm p_103392_, PoseStack p_103393_) {
		ModelPart modelpart = this.getArm(p_103392_);
		if (this.slim) {
			float f = 0.5F * (float) (p_103392_ == HumanoidArm.RIGHT ? 1 : -1);
			modelpart.x += f;
			modelpart.translateAndRotate(p_103393_);
			modelpart.x -= f;
		} else {
			modelpart.translateAndRotate(p_103393_);
		}
	}

	public ModelPart getRandomModelPart(Random p_103407_) {
		return this.parts.get(p_103407_.nextInt(this.parts.size()));
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.rightSleeve.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftSleeve.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.ear.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.ear.xRot = headPitch / (180F / (float) Math.PI);
		this.leftPants.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightPants.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
