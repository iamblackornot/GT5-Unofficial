package gregtech.api.graphs.consumers;

import gregtech.api.interfaces.tileentity.IEnergyConnected;
import java.util.ArrayList;
import net.minecraft.tileentity.TileEntity;

public class NodeEnergyConnected extends ConsumerNode {
    public NodeEnergyConnected(
            int aNodeValue, IEnergyConnected aTileEntity, byte aSide, ArrayList<ConsumerNode> aConsumers) {
        super(aNodeValue, (TileEntity) aTileEntity, aSide, aConsumers);
    }

    @Override
    public boolean needsEnergy() {
        return super.needsEnergy();
    }

    @Override
    public int injectEnergy(long aVoltage, long aMaxAmps) {
        return (int) ((IEnergyConnected) mTileEntity).injectEnergyUnits(mSide, aVoltage, aMaxAmps);
    }
}
