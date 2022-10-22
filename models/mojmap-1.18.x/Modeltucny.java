// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltucny<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tucny"), "main");
	private final ModelPart legsl2;
	private final ModelPart torso;
	private final ModelPart arml;
	private final ModelPart legsr;
	private final ModelPart armr2;
	private final ModelPart head;

	public Modeltucny(ModelPart root) {
		this.legsl2 = root.getChild("legsl2");
		this.torso = root.getChild("torso");
		this.arml = root.getChild("arml");
		this.legsr = root.getChild("legsr");
		this.armr2 = root.getChild("armr2");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition legsl2 = partdefinition.addOrReplaceChild("legsl2", CubeListBuilder.create().texOffs(16, 44)
				.addBox(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, -1.0F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-8.0F, -28.0F, -7.0F, 16.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create().texOffs(0, 44).addBox(
				0.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -4.0F, -1.0F));

		PartDefinition legsr = partdefinition.addOrReplaceChild("legsr", CubeListBuilder.create().texOffs(44, 44)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, -1.0F));

		PartDefinition armr2 = partdefinition.addOrReplaceChild("armr2", CubeListBuilder.create().texOffs(32, 28)
				.addBox(-4.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, -4.0F, -1.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 28).addBox(
				-7.0F, -15.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 3.0F, -3.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		legsl2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legsr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legsl2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.armr2.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.torso.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legsr.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.arml.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}