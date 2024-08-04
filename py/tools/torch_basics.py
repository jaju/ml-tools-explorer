import torch
import torch.nn as nn
import torch.optim as optim

rnd_vec = torch.randn(10)
print(type(rnd_vec))
print(rnd_vec)

view_vec = rnd_vec.view(-1)
print(view_vec)

# 5 groups of 2 each
view_matrix = rnd_vec.view(5, 2)
print(view_matrix)

# 2 groups of 5 groups of 1 each
view_3d = rnd_vec.view(2, 5, 1)
print(view_3d)

class LinearRegressor(nn.Module):
    def __init__(self):
        super(LinearRegressor, self).__init__()
        self.linear = nn.Linear(1, 1)

    def forward(self, x):
        return self.linear(x)

model = LinearRegressor()

for name, param in model.named_parameters():
    if param.requires_grad:
        print(name, param)

criterion = nn.MSELoss()
optimizer = optim.SGD(model.parameters(), lr=0.1)

x_train = torch.randn(10, 1)
y_train = 3 * x_train + 2

model.train()

for epoch in range(1000):
    optimizer.zero_grad()
    outputs = model(x_train)
    loss = criterion(outputs, y_train)
    loss.backward()
    optimizer.step()

model.eval()

x_test = torch.tensor([5.0])
y_test = model(x_test)

print(y_test.item())

x2_test = torch.randn(5, 1)
y2_test = model(x2_test)

# The values printed should be vanishingly small
print((x2_test * 3 + 2) - y2_test)

def create_model(x_train, y_train, epochs=1000, lr=0.1):
    model = LinearRegressor()
    loss_criterion = nn.MSELoss()
    optimizer = optim.SGD(model.parameters(), lr=lr)
    model.train()
    for epoch in range(epochs):
        optimizer.zero_grad()
        outputs = model(x_train)
        loss = loss_criterion(outputs, y_train)
        loss.backward()
        optimizer.step()
    model.eval()
    return model

y2_ideal = x2_test * 3 + 2
model1 = create_model(x_train, y_train, 1000, 1)
print(model1(x2_test) - y2_ideal)

model2 = create_model(x_train, y_train, 1000, 0.01)
print(model2(x2_test) - y2_ideal)

model3 = create_model(x_train, y_train, 1000, 0.1)
print(model3(x2_test) - y2_ideal)
