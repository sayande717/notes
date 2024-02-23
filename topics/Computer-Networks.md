# Formulae
## FRL Collision Domain
The maximum amount of collisions that can occur.
Number of devices = `n`
- Cable: $n$
- Repeater: $n$

# Basics

## Network Types
- Based on Distance, the network types are:
    - PAN: Personal Area Network
    - LAN: Local Area Network
    - CAN: Campus Area Network
    - MAN: Metropolitan Area Network
    - WAN: Wide Area Network
- As distance increases, the number of devices used also increases, and we also have to put repeaters or network extenders to ensure the signal is strong enough to reach the destination.
- As distance increases, the error rates & maintainence cost also increases.

## OSI Model

<img src="../assets/images/Computer-Networks/external/0.jpg" height="400px" alt="OSI Model" />

Image taken from [here](https://www.lifewire.com/thmb/eaQyjAgWa-S1JKEfZxlFYoB-0V8=/1536x1024/filters:fill(auto,1)/OSImodel-8d93f19d50e543348f82110aa11f7a93.jpg)

### Why?
- There are a lot of functionalities and protocols that are necessary to send data from the client to the server, or vice versa.
- OSI is a theoritical model, ie it is not implemented in real life. But, using this model, all the other models are developed.
- OSI Model defines the layers in a network system, how the protocols are implemented in each layer, and how they work together to achieve it's primary purpose of moving data from Point A to Point B.

### Layers
- Application
- Presentation
- Session
- Transport
- Network
- Data Link
- [Physical](#physical-layer)

### Difference vs TCP/IP Model
<img src="../assets/images/Computer-Networks/external/1.jpg" height="350px" alt="TCP/IP Model" />

Image taken from [here](https://ipcisco.com/wp-content/uploads/2018/10/tcpip-model.jpg)

- TCP/IP layer is an implementable model.
- It was a protocol defined by ARPANET for use by them.
- It combines the `Application, Presentation` & `Session layer` into the `Application Layer`.
- The `Network Layer` is defined as the `Internet Layer`.
- It combines the `Data Link Layer & Physical Layer` into `Network Access Layer`.

## Physical Layer
- Deals with hardware.
- Isn't concerned with security, that part is handled by the software.

### Network Topologies

<img src="../assets/images/Computer-Networks/external/2.png" width="800px">

Image taken from [here](https://ofbit.in/wp-content/uploads/2022/05/Full-Mesh-Topology-OFBIT.in_-1024x1024.jpg)


#### Point-to-Point Topology
- Direct communication between two devices.
- Simple and easy to implement.
- Suitable for small networks.
- Efficient and reliable communication.

#### Mesh Topology
- Every device is connected to every other device.
- Redundant paths enhance reliability.
- High fault tolerance but expensive and complex.
- Common in critical applications where reliability is crucial.

#### Star Topology
- All devices are connected to a central hub or switch.
- Easy to install and manage.
- Failure in one device doesn't affect others.
- Centralized control and potential single point of failure.

#### Bus Topology
- Single central cable to which all devices are connected.
- Simple and inexpensive.
- Limited cable length and potential for collisions.
- Suitable for small networks with low traffic.

#### Ring Topology
- Devices connected in a circular fashion.
- Each device has exactly two neighbors for communication purposes.
- Unidirectional or bidirectional communication.
- Potential for data collisions and a failure in one device can disrupt the entire network.

|↓ Parameter \| Topology →|Mesh|Star|Bus|Ring|
|---|---|---|---|---|
|Number of Cables|$(n(n-1))/2$|$n$|$n+1$|$n$|
|Number of ports|$n(n-1)$|$n$|$n$|$2n$|
|Reliability|high|low|low|low|
|Affected by noise?|no|no|yes|yes|
|Cost|high|low|low|low|
|Security|high|medium|[low](#reason-hub)|[low](#reason-cable)|low|
|P2P between devices|yes|no|no|yes|
|Multipoint|no|no|yes|no|


- Reliability = **low** means there is a single point of failure.
- #reason-hub: The hub broadcasts messages to all devices by default.
- #reason-cable: The cable cannot filter or send data to only a specific device.

## Manchester Encoding
- It is used to encode 1's and 0's.
- There are 2 variants: The one by G E Thomas, and the IEEE 802.3 version. By default, IEEE 802.3 is used.

    <img src="../assets/images/Computer-Networks/external/3.jpg" alt="Manchester Encoding" width="500px" />

    Image taken from [here](https://media.geeksforgeeks.org/wp-content/uploads/ETHERNET_1.jpg)

## Networking Devices
- Hardware only: [Cables](#cable), Repeaters, Hubs
- Hardware + Software: Router, Gateway, Firewall, Modem
- Software only: IDS

### Cable
- Layer: `Physical`
- Types:
    - Baseband: `Only 1` signal can be transmitted over the cable at any point of time.
    - Broadband: `>1` signals can be transmitted over the cable in parallel.
- Signal filtering/attenuation: Not possible, since it's purely hardware.
- Collision: A maximum of `n` collisions can occur, if there are `n` connected devices.

- **100BaseT**:
    - `100`: speed in Mbps
    - `Base`: Type of cable, Baseband / Broadband
    - `T`/`2`/`5`/`Fx`: 100/200/500 metres or Fiber Channel, range about 2km. The signal quality deteriorates beyond the range.

### Repeater
- Layer: `Physical`
- It is a 2 port device.
- While an amplifier amplifies the signal (from x to 2x,3x, etc), a repeater regenerates the signal (x) and retains it's original strength.
- Signal filtering/attenuation: Not possible, since it's purely hardware.
- **Collision Domain**: A maximum of `n` collisions can occur, if there are `n` connected devices.
- **Broadcast Domain**: Any broadcast packet will reach all devices connected, on all sides of the repeater.

### Hub
- Layer: `Physical`
- A hub is a multi-port repeater.
- It has $>2$ ports.
- There is some basic functionality built-in, using which we can check if all devices are properly connected or not.
- Signal filtering/attenuation: Not possible. If `A` wants to send some data to `B`, then the others also get the message. The message is broadcasted messages to all connected devices.
- **Collision Domain**: A maximum of `n` collisions can occur, if there are `n` connected devices.
- **Broadcast Domain**: Any broadcast packet will reach all devices connected, on all sides of the hub.

### Bridge
- Layer: `Data Link`
- Bridges are used to connect 2 different LANs.
- A packet transmitted by a device contains the source & destination MAC address.
- Signal filtering/attenuation: Possible. If the bridge notices that some packet does not need to be forwarded to the other LAN to reach it's destination, it can filter the packet & directly send it to the destination, on the same LAN it originated in.
- 2 Types: Static & Dynamic
    - **Static**: The MAC to Port mapping table is static. The network administrator sets it up when setting up the device.
        ```diff
        - Cannot dynamically map MAC Address -> Ports.
        - If the device MAC Address changes for some reason, the mapping will need to be re-done manually.
        ```
    - **Dynamic**: The MAC to Port mapping table is dynamic. It learns about the mapping by itself, without the interference of the network administrator.
        ```diff
        + Learns and maps MAC -> Port by itself.
        - Broadcasts the message to all devices, if it doesn't know the destination.
        - Takes some time to learn about the mappings, at first.
        ```
        - Initially, it is empty.
        - When the switch cannot find the destination in the MAC to Port mapping table, it broadcasts the packet to all devices.
        - The device which has accepted it, sends back the ACK (Acknowledgement) packet. 
        - Using that packet, the bridge 'learns' about the location of the destination device and adds it to the mapping table.
- It uses Spanning Trees in the form of `Bridge Data Unit Protocol`, which ensures that data packets don't get stuck in a loop.
- **Collision Domain**: The bridge uses the `Store & Forward` strategy. It stores the incoming packet, processes it, and then sends it to the destination. There may be collisions within the networks themselves, but not across them.
- **Broadcast Domain**: Any broadcast packet will reach all devices connected, on all sides of the bridge.

### Switch
- Layer: `Data Link`
- It is a multi-port bridge.
- We connect multiple devices with a switch, which in turn is connected to the router, which in turn is connected to the Internet (optional).
- Switch provides full-duplex links to the devices.
    > Duplex: Data can be sent/Received parallely. <br>
    > Simplex: Only 1 signal can be transmitted at a time.
- **Collision Domain**: The switch uses the `Store & Forward` strategy. It stores the incoming packet, processes it, and then sends it to the destination. There may be collisions within the networks themselves, but not across them.
- **Broadcast Domain**: Any broadcast packet will reach all devices connected, on all sides of the switch.

### Router
- Layer: `Physical` `Data Link` `Network`
- It is a multi-port device. Multiple networks can be connected to it at the same time.
- Router can check for both MAC & IP addresses.
- The router receives an IP Address (usually `XXX.XXX.XXX.1`) from each network it is connected to, so that it can identify and differentiate between them.
- Forwarding/Flooding: Once the router receives a data packet containing the source & destination IP & MAC Address, it checks it's **Routing Table**.
    - If it finds the entry, it forwards it to the destination.
    - If it does not find the entry ie cannot decide where to send the packet, it floods the network ie broadcasts it to all networks.
- Filtering: If the router receives something like an ARP request, it can send it back to the same network.
    > An ARP (Address Resolution Protocol) request is a message sent by a device on a network to discover the MAC (Media Access Control) address associated with a specific IP (Internet Protocol) address.
- **Collision Domain**: The switch uses the `Store & Forward` strategy. It stores the incoming packet, processes it, and then sends it to the destination. There may be collisions within the networks themselves, but not across them.
- **Broadcast Domain**: Any broadcast packet will reach all devices connected but only within the network. It will not propagate to the other networks connected to the router.

## Collision Domain & Broadcast Domain
- **Collision Domain**: A collision domain represents the network segment where collisions can occur. If multiple devices send data packets at the same time in a shared medium, the data packets will collide with each other. In the worst case, the collision domain can be $n$ if there are $n$ devices connected.
- **Broadcast Domain**: Whether all devices receive the data packet a particular device on the network sends, regardless of if it was intended for them or not.

| Device   | Collision Domain     | Broadcast Domain    |
|----------|----------------------|---------------------|
| Repeater | Unchanged            | Unchanged           |
| Hub      | Unchanged            | Unchanged           |
| Bridge   | Reduced              | Unchanged           |
| Switch   | Reduced              | Unchanged           |
| Router   | Reduced              | Reduced             |

### Gateway
### IDS (Intrusion Detection System)
### Firewall
### Modem

### Cables & Connectors
### Networking hardware
### Transmission modes
### Multiplexing
### Encoding
