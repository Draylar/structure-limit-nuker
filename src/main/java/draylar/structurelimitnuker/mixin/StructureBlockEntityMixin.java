package draylar.structurelimitnuker.mixin;

import net.minecraft.block.entity.StructureBlockBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(StructureBlockBlockEntity.class)
public class StructureBlockEntityMixin {

    @ModifyConstant(
            method = "fromTag",
            constant = @Constant(intValue = 48)
    )
    private int modifyUpperLimits(int og) {
        return 256;
    }

    @ModifyConstant(
            method = "fromTag",
            constant = @Constant(intValue = -48)
    )
    private int modifyLowerLimits(int og) {
        return -256;
    }
}
